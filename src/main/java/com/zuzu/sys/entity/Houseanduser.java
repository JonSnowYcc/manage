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
public class Houseanduser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;


    private Integer houseId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }


    @Override
    public String toString() {
        return "Houseanduser{" +
            "userId=" + userId +
            ",houseId=" + houseId +
        "}";
    }
}
