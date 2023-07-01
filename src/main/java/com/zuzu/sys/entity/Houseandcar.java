package com.zuzu.sys.entity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
public class Houseandcar implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer houseId;

    private Integer carNum;


    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getCarNum() {return carNum;  }

    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    @Override
    public String toString() {
        return "Houseandcar{" +
            "houseId=" + houseId +
            ",carNum=" + carNum +
        "}";
    }
}
