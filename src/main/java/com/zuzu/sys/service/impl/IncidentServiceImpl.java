package com.zuzu.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zuzu.commom.vo.ResponseObject;
import com.zuzu.commom.vo.Result;
import com.zuzu.sys.entity.Incident;
import com.zuzu.sys.mapper.IncidentMapper;
import com.zuzu.sys.service.IIncidentService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.zuzu.commom.vo.ReturnCode.SUCCESS;
import static com.zuzu.commom.vo.ReturnCode.FAIL;

import java.lang.*;
import java.util.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
@Service
public  class IncidentServiceImpl extends ServiceImpl<IncidentMapper, Incident> implements IIncidentService {
    @Autowired
    private IncidentMapper incidentMapper;




    @Override
    public ResponseObject getIncidentList(String listType) {
        LambdaQueryWrapper<Incident> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Incident::getUserId,listType);
        try {
            List<Incident> incidentList = incidentMapper.selectList(lambdaQueryWrapper);
            return new ResponseObject(SUCCESS,"查询成功",incidentList);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseObject(FAIL,"查询失败",null);
        }

    }
    @Override
    public ResponseObject getIncidentDetailById(Long incidentNum) {
        LambdaQueryWrapper<Incident> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Incident::getIncidentNum,incidentNum);
        try {
           Incident incident = incidentMapper.selectOne(lambdaQueryWrapper);
            return new ResponseObject(SUCCESS,"查询成功",incident);
        }catch (Exception e){

            e.printStackTrace();
            return new ResponseObject(FAIL,"查询失败",null);
        }

    }
    @Override
    public Result reportingIncidents(String incidentType, String incidentPlace, Integer userId, Integer userPhone, String incidentDes,Date reportTime,String fileUrl) {
        Incident incident = new Incident();
                incident.getUserId();
                incident.getIncidentType();
                incident.getUserPhone();
                incident.getIncidentPlace();
                incident.getFileUrl();
                incident.getReportTime();
                incident.getIncidentDes();
        try {
            incidentMapper.insert(incident);
            return Result.success();
        }catch (Exception e){
            e.printStackTrace();
            return Result.success();
        }
    }
    @Override
    public ResponseObject getAllIncidentUserPost(Long userId) {
        LambdaQueryWrapper<Incident> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Incident::getUserId,userId);
        try {
            List<Incident> incidents = incidentMapper.selectList(lambdaQueryWrapper);
            return new ResponseObject(SUCCESS,"查询成功",incidents);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseObject(FAIL,"修改失败",null);
        }
    }







}
