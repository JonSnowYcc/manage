package com.zuzu.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
public class Incident implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Incident_num", type = IdType.AUTO)
    private Integer incidentNum;

    private String incidentType;

    private String incidentPlace;

    private Integer userId;

    private Integer userPhone;
    private String incidentDes;
    private Date reportTime;
    private String fileUrl;

    public Integer getIncidentNum() {
        return incidentNum;
    }

    public void setIncidentNum(Integer incidentNum) {
        this.incidentNum = incidentNum;
    }
    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }
    public String getIncidentPlace() {
        return incidentPlace;
    }

    public void setIncidentPlace(String incidentPlace) {
        this.incidentPlace = incidentPlace;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }


    @Override
    public String toString() {
        return "Incident{" +
            "incidentNum=" + incidentNum +
            ", incidentType=" + incidentType +
            ", incidentPlace=" + incidentPlace +
            ", userId=" + userId +
            ", userPhone=" + userPhone +
        "}";
    }

    public String getIncidentDes() {
        return incidentDes;
    }

    public void setIncidentDes(String incidentDes) {
        this.incidentDes = incidentDes;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
