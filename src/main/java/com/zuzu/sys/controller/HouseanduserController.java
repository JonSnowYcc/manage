package com.zuzu.sys.controller;

import com.zuzu.commom.vo.Result;
import com.zuzu.sys.entity.House;
import com.zuzu.sys.entity.Houseandcar;
import com.zuzu.sys.entity.Houseanduser;
import com.zuzu.sys.service.IHouseanduserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
@RestController
@RequestMapping("/houseanduser")
public class HouseanduserController {

    @Autowired
    IHouseanduserService houseanduserService;

    //绑定房屋 只需要房屋号和用户ID
    @PostMapping
    public Result<?> addHouse(@RequestBody Houseanduser houseanduser) {
        houseanduserService.save(houseanduser);
        return Result.success("绑定房屋成功");

    }
}
