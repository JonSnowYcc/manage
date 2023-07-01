package com.zuzu.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
@Data
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Car_num", type = IdType.AUTO)
    private Integer carNum;

    private String carColor;

    private String carType;

    private Integer carParNum;

    private String payStatus;

    public Integer getCarNum() {
        return carNum;
    }

    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    public Integer getCarParNum() {
        return carParNum;
    }

    public void setCarParNum(Integer carParNum) {
        this.carParNum = carParNum;
    }
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    @Override
    public String toString() {
        return "Car{" +
            "carNum=" + carNum +
            ", carColor=" + carColor +
            ", carType=" + carType +
            ", carParNum=" + carParNum +
            ", payStatus=" + payStatus +
        "}";
    }
}
