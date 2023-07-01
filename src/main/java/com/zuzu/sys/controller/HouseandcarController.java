package com.zuzu.sys.controller;

import com.zuzu.commom.vo.Result;
import com.zuzu.sys.entity.Car;
import com.zuzu.sys.entity.Houseandcar;
import com.zuzu.sys.service.IHouseandcarService;
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
@RequestMapping("/houseandcar")
public class HouseandcarController {

        @Autowired
        IHouseandcarService houseandcarService;

        @PostMapping
        public Result<?> addHouse(@RequestBody Houseandcar houseandcar){
            houseandcarService.save(houseandcar);
            return Result.success("绑定车辆成功");
        }

}


