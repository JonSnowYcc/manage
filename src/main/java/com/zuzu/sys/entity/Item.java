package com.zuzu.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Item_num", type = IdType.AUTO)
    private Integer itemNum;

    private String itemName;

    private String itemType;

    private LocalDate itemTime;

    private Integer itemAmount;

    private String itemReason;

    private Integer agree;

    private Integer disagree;

    private String conclusion;

    private LocalDate startTime;

    private LocalDate endTime;

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public LocalDate getItemTime() {
        return itemTime;
    }

    public void setItemTime(LocalDate itemTime) {
        this.itemTime = itemTime;
    }
    public Integer getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Integer itemAmount) {
        this.itemAmount = itemAmount;
    }
    public String getItemReason() {
        return itemReason;
    }

    public void setItemReason(String itemReason) {
        this.itemReason = itemReason;
    }
    public Integer getAgree() {
        return agree;
    }

    public void setAgree(Integer agree) {
        this.agree = agree;
    }
    public Integer getDisagree() {
        return disagree;
    }

    public void setDisagree(Integer disagree) {
        this.disagree = disagree;
    }
    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }
    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Item{" +
            "itemNum=" + itemNum +
            ", itemName=" + itemName +
            ", itemType=" + itemType +
            ", itemTime=" + itemTime +
            ", itemAmount=" + itemAmount +
            ", itemReason=" + itemReason +
            ", agree=" + agree +
            ", disagree=" + disagree +
            ", conclusion=" + conclusion +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
        "}";
    }
}
