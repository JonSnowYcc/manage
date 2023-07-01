package com.zuzu.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zuzu.commom.vo.Result;
import com.zuzu.sys.entity.Car;
import com.zuzu.sys.entity.House;
import com.zuzu.sys.entity.Houseanduser;
import com.zuzu.sys.entity.User;
import com.zuzu.sys.service.ICarService;
import com.zuzu.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
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
@RequestMapping("/car")
public class CarController {
    @Autowired
    private ICarService carService;

    @GetMapping("/list")
    public Result<Map<String, Object>> getCarList(@RequestParam(value = "Car_color", required = false) String Car_color,
                                                    @RequestParam(value = "pageNo") Long pageNo,
                                                    @RequestParam(value = "pageSize") Long pageSize) {
        LambdaQueryWrapper<Car> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.hasLength(Car_color), Car::getCarColor, Car_color);

        Page<Car> page = new Page<>(pageNo, pageSize);
        carService.page(page, wrapper);

        Map<String, Object> data = new HashMap<>();
        data.put("total", page.getTotal());
        data.put("rows", page.getRecords());

        return Result.success(data);
    }

    @PostMapping
    public Result<?> addCar(@RequestBody Car car) {
        carService.save(car);
        return Result.success("车辆添加成功");
    }

}
