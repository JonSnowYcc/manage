package com.zuzu.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zuzu.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zuzu.sys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
public interface IUserService extends IService<User> {

    Map<String, Object> login(User user) ;
    Map<String, Object> getUserInfo(String token);

    void logout(String token);




}

