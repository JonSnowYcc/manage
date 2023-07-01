package com.zuzu.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "House_id", type = IdType.AUTO)
    private Integer houseId;

    private String houseCuAd;

    private String houseCuName;

    private Integer houseUnit;

    private Integer houseBuilding;

    private Integer houseNumber;

    public Integer getHouseId() { return houseId; }

    public void setHouseId(Integer houseId) { this.houseId = houseId;}

    public String getHouseCuAd() { return houseCuAd;}

    public void setHouseCuAd(String houseCuAd) {
        this.houseCuAd = houseCuAd;
    }
    public String getHouseCuName() {
        return houseCuName;
    }

    public void setHouseCuName(String houseCuName) {
        this.houseCuName = houseCuName;
    }
    public Integer getHouseUnit() {
        return houseUnit;
    }

    public void setHouseUnit(Integer houseUnit) {
        this.houseUnit = houseUnit;
    }
    public Integer getHouseBuilding() {
        return houseBuilding;
    }

    public void setHouseBuilding(Integer houseBuilding) {
        this.houseBuilding = houseBuilding;
    }
    public Integer getHouseNumber() { return houseNumber;}

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "House{" +
            "houseId=" + houseId +
            ", houseCuAd=" + houseCuAd +
            ",houseCuName=" + houseCuName +
            ",HouseUnit=" + houseUnit +
            ",houseBuilding=" + houseBuilding +
            ",houseNumber=" + houseNumber +
        "}";
    }
}
