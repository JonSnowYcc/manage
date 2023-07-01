package com.zuzu.sys.service;

import com.zuzu.commom.vo.ResponseObject;
import com.zuzu.commom.vo.Result;
import com.zuzu.sys.entity.Incident;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
public interface IIncidentService extends IService<Incident> {


    ResponseObject getIncidentList(String listType);

    ResponseObject getIncidentDetailById(Long incidentNum);

    Result reportingIncidents(String incidentType, String incidentPlace, Integer userId, Integer userPhone, String incidentDes, Date reportTime,String fileUrl);

    ResponseObject getAllIncidentUserPost(Long userId);
}
