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
public class Sug implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Sug_num", type = IdType.AUTO)
    private Integer sugNum;

    private String sugStatus;

    private String userPhone;

    private String sugType;

    private String sugDes;

    private Integer userId;
    private Date reportTime_;

    public Integer getSugNum() {
        return sugNum;
    }

    public void setSugNum(Integer sugNum) {
        this.sugNum = sugNum;
    }
    public String getSugStatus() {
        return sugStatus;
    }

    public void setSugStatus(String sugStatus) {
        this.sugStatus = sugStatus;
    }
    public String getResidentPhone() {
        return userPhone;
    }

    public void setResidentPhone(String residentPhone) {
        this.userPhone = residentPhone;
    }
    public String getSugType() {
        return sugType;
    }

    public void setSugType(String sugType) {
        this.sugType = sugType;
    }
    public String getSugDes() {
        return sugDes;
    }

    public void setSugDes(String sugDes) {
        this.sugDes = sugDes;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Sug{" +
            "sugNum=" + sugNum +
            ", sugStatus=" + sugStatus +
            ", residentPhone=" + userPhone +
            ", sugType=" + sugType +
            ", sugDes=" + sugDes +
            ", userId=" + userId +
        "}";
    }

    public Date getReportTime_() {
        return reportTime_;
    }

    public void setReportTime_(Date reportTime_) {
        this.reportTime_ = reportTime_;
    }
}
