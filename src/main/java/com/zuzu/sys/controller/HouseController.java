package com.zuzu.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zuzu.commom.vo.Result;
import com.zuzu.sys.entity.House;
import com.zuzu.sys.mapper.HouseMapper;
import com.zuzu.sys.service.IHouseService;
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
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private IHouseService houseService;


    //分页查询
    @GetMapping("/list")
    public Result<Map<String,Object>> getHouseList(@RequestParam(value = "House_cu_name",required = false) String House_cu_name,
                                                   @RequestParam(value = "pageNo") Long pageNo,
                                                   @RequestParam(value = "pageSize") Long pageSize){
        LambdaQueryWrapper<House> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.hasLength(House_cu_name),House::getHouseCuName,House_cu_name);

        Page<House> page = new Page<>(pageNo,pageSize);
        houseService.page(page,wrapper) ;

        Map<String,Object> data = new HashMap<>();
        data.put("total",page.getTotal()) ;
        data.put("rows",page.getRecords());

        return Result.success(data);
    }

    //修改房屋信息
    @PutMapping
    public Result<?> updateHouse(@RequestBody House house){
        houseService.updateById(house);
        return Result.success(house);
    }

    //房屋信息
    @GetMapping("/{house_id}")
    public  Result<House> getHouseById(@PathVariable("house_id") Integer house_id ){
        House house = houseService.getById(house_id);
        return Result.success(house);
    }

    @DeleteMapping("/{houseId}")
    public  Result<House> getHouseByID(@PathVariable("houseId") Integer houseId){
        houseService.removeById(houseId);
        return Result.success("删除房屋成功");
    }
}
