package com.zuzu.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zuzu.commom.vo.Result;
import com.zuzu.sys.entity.Car;
import com.zuzu.sys.entity.Family;
import com.zuzu.sys.entity.User;
import com.zuzu.sys.service.IFamilyService;
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
@RequestMapping("/family")
public class FamilyController {
    @Autowired
    IFamilyService familyService;

    @GetMapping("/list")
    public Result<Map<String, Object>> getFamilyList(@RequestParam(value = "relationship", required = false) String relationship,
                                                     @RequestParam(value = "userId") Integer userId,
                                                     @RequestParam(value = "pageNo") Long pageNo,
                                                     @RequestParam(value = "pageSize") Long pageSize) {
        LambdaQueryWrapper<Family> wrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper<User> wrapper2 = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.hasLength(relationship), Family::getRelationship, relationship);
        wrapper2.eq(StringUtils.hasLength(String.valueOf(userId)), User::getUserId, userId);

        Page<Family> page = new Page<>(pageNo, pageSize);
        familyService.page(page, wrapper);

        Map<String, Object> data = new HashMap<>();
        data.put("total", page.getTotal());
        data.put("rows", page.getRecords());

        return Result.success(data);
    }



    @PostMapping
    public Result<?> addHouse(@RequestBody Family family) {
        familyService.save(family);
        return Result.success("家人绑定成功");
    }

}
