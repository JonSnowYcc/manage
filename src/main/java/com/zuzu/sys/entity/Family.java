package com.zuzu.sys.entity;

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
public class Family implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer familyId;

    private String relationship;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {this.userId = userId;  }
    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) { this.familyId = familyId; }
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Family{" +
            "userId=" + userId +
            ", familyId=" + familyId +
            ", relationship=" + relationship +
        "}";
    }
}
