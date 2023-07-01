package com.zuzu.sys.service.impl;

import com.alibaba.fastjson2.JSON;
import com.zuzu.sys.entity.User;
import com.zuzu.sys.mapper.UserMapper;
import com.zuzu.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Map<String,Object> login(User user){
        //根据用户名和密码查询
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();//写代码时可以检查
        wrapper.eq(User::getUserId, user.getUserId());
        wrapper.eq(User::getUserPw, user.getUserPw());
        User loginUser = this.baseMapper.selectOne(wrapper);
        if(loginUser != null){
            //暂时UUID，终极方案是jwt
            String key = "user:" + UUID.randomUUID();

            //存入redis
            loginUser.setUserPw(null);//稍后做加密处理
            redisTemplate.opsForValue().set(key,loginUser,30, TimeUnit.MINUTES);

            //返回数据
            Map<String,Object> data = new HashMap<>();
            data.put("token",key);
            return data;
        }
        return null;
    }

    //获取用户信息（待定）
    @Override
    public Map<String, Object> getUserInfo(String token) {
        //根据token获取用户信息，redis
        Object obj = redisTemplate.opsForValue().get(token);
        if(obj != null) {
            //反向序列化为优质对象
            User loginUser = JSON.parseObject(JSON.toJSONString(obj), User.class);
            Map<String, Object> data = new HashMap<>();
            //需要与数据库的名字保持一致，可能还需要修改
            data.put("name",loginUser.getUserName());
            data.put("Ad",loginUser.getUserAd());
            //data.put("avatar",loginUser.getAvatar());

            //角色,待改，可以用到我们的用户和业委会的区分中
            //data.put("");

            return data;
        }
        return null;

    }
    @Override
    public void logout(String token) {
        redisTemplate.delete(token);
    }
}
