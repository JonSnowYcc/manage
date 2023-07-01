package com.zuzu.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zuzu.commom.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.zuzu.sys.service.IIncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zuzu.commom.vo.ResponseObject;

import java.util.Date;
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
@RequestMapping("/incident")
public class IncidentController {

    @Autowired
    private IIncidentService incidentService;

    //获取事件列表(按userId返回不同列表)
//    @GetMapping("/list")
//    public ResponseObject getIncidentList(@RequestParam String listType) {
//        return incidentService.getIncidentList(listType);
//    }
//
//    //获取事件信息
//    @GetMapping("getIncidentDetailById")
//    public ResponseObject getIncidentDetailById(@RequestParam Long incidentNum) {
//        return incidentService.getIncidentDetailById(incidentNum);
//    }
//
//    //上报事件
//    @PostMapping("reportingIncidents")
//    public Result reportingIncidents(@RequestBody String incidentType, String incidentPlace, Integer userId, Integer userPhone, String incidentDes, Date reportTime, String fileUrl) {
//
//        return incidentService.reportingIncidents(incidentType, incidentPlace, userId, userPhone, incidentDes, reportTime, fileUrl);
//    }
//
//    //获取事件信息（查询）
//    @GetMapping("getIncidentDetailById")
//    public Result<Map<String, Object>> getIncidentList(@RequestParam(value = "incidentType", required = false) String incidentType,
//                                                       @RequestParam(value = "reportTime", required = false) String reportTime,
//                                                       @RequestParam(value = "pageNo") Long pageNo,
//                                                       @RequestParam(value = "pageSize") Long pageSize) {
//
//
//        //获取当前用户发布的问题
////    @PostMapping("getAllIncidentUserPost")
////    public ResponseObject getAllIncidentUserPost(@RequestParam Long userId){
////        return incidentService.getAllIncidentUserPost(userId);
////    }
////
//
//        return null;
//    }
}




