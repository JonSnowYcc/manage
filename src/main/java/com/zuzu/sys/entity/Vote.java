package com.zuzu.sys.entity;

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
public class Vote implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer itemNum;

    private Integer userId;

    private String vote;

    private LocalDate votingTime;

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }
    public LocalDate getVotingTime() {
        return votingTime;
    }

    public void setVotingTime(LocalDate votingTime) {
        this.votingTime = votingTime;
    }

    @Override
    public String toString() {
        return "Vote{" +
            "itemNum=" + itemNum +
            ", userId=" + userId +
            ", vote=" + vote +
            ", votingTime=" + votingTime +
        "}";
    }
}
