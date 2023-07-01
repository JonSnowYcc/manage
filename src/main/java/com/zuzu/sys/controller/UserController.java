package com.zuzu.sys.controller;

import com.baomidou.mybatisplus.core.assist.ISqlRunner;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zuzu.commom.vo.Result;
import com.zuzu.sys.entity.Car;
import com.zuzu.sys.entity.Family;
import com.zuzu.sys.entity.User;
import com.zuzu.sys.mapper.UserMapper;
import com.zuzu.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
@RestController
@RequestMapping("/user")
//   @CrossOrigin    跨域处理
public class UserController {
    @Autowired
    private IUserService userService;
    UserMapper userMapper;

    @GetMapping("/all")
    public Result<List<User>> getAllUser(){
        List<User> list = userService.list();
        return Result.success(list,"查询成功");
    }

    @PostMapping("/login")
    public Result<Map<String,Object>> login(@RequestBody User user){
        Map<String,Object> data = userService.login(user);
        if(data != null){
            return Result.success(data);
        }
        return Result.fail(20002,"用户名或密码错误");
    }

    //获取用户信息接口
    @GetMapping("/info")
    public Result<Map<String,Object>> getUserInfo(@RequestParam("token") String token){
        //根据token获取用户信息，redis
        Map<String,Object> data = userService.getUserInfo(token);
        if(data != null){
            return Result.success(data);
        }
        return Result.fail(20003,"登录信息无效：请重新登录！");

    }
    //注销接口
    @PostMapping("/logout")
    public Result<?> logout(@RequestHeader("X-Token") String token){
        userService.logout(token);
        return Result.success();
    }

    //用户信息查看接口
    @GetMapping("/list")
    public Result<Map<String,Object>> getUserList(@RequestParam(value = "username",required = false) String username,
                                                 @RequestParam(value = "userphone",required = false) String userphone,
                                                 @RequestParam(value = "pageNo") Long pageNo,
                                                 @RequestParam(value = "pageSize") Long pageSize){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.hasLength(username),User::getUserName,username);
        wrapper.eq(StringUtils.hasLength(userphone),User::getUserPhone,userphone);

        Page<User> page = new Page<>(pageNo,pageSize);
        userService.page(page,wrapper) ;

        Map<String,Object> data = new HashMap<>();
        data.put("total",page.getTotal()) ;
        data.put("rows",page.getRecords());

        return Result.success(data);
    }

    @GetMapping("/brolist")

    public Result<Map<String, Object>> getUserList(  @RequestParam(value = "userId") Integer userId,
                                                     @RequestParam(value = "pageNo") Long pageNo,
                                                     @RequestParam(value = "pageSize") Long pageSize) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();



        wrapper.exists("SELECT * FROM user WHERE user_id = 3");
        wrapper.eq(StringUtils.hasLength(String.valueOf(userId)),User::getUserName,userId);

//        List<User> userList = userMapper.selectList(wrapper);
//
//        for (User user : userList) {
//            System.out.println(user);
//        }

        Page<User> page = new Page<>(pageNo, pageSize);
        userService.page(page, wrapper);

        Map<String, Object> data = new HashMap<>();
        data.put("total", page.getTotal());
        data.put("rows", page.getRecords());

        return Result.success(data);
    }

    @PostMapping
    public Result<?> addHouse(@RequestBody User user) {
        userService.save(user);
        return Result.success("居民注册成功");
    }
}
