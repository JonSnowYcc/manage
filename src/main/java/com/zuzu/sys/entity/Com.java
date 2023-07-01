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
public class Com implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Com_id", type = IdType.AUTO)
    private Integer comId;

    private String comPw;

    private String comCuName;

    private String comCuPlace;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }
    public String getComPw() {
        return comPw;
    }

    public void setComPw(String comPw) {
        this.comPw = comPw;
    }
    public String getComCuName() {
        return comCuName;
    }

    public void setComCuName(String comCuName) {
        this.comCuName = comCuName;
    }
    public String getComCuPlace() {
        return comCuPlace;
    }

    public void setComCuPlace(String comCuPlace) {
        this.comCuPlace = comCuPlace;
    }

    @Override
    public String toString() {
        return "Com{" +
            "comId=" + comId +
            ", comPw=" + comPw +
            ", comCuName=" + comCuName +
            ", comCuPlace=" + comCuPlace +
        "}";
    }
}
