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
public class Deal implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer incidentNum;

    private Integer priority;

    private String incidentStatus;

    private String processor;

    public Integer getIncidentNum() {
        return incidentNum;
    }

    public void setIncidentNum(Integer incidentNum) {
        this.incidentNum = incidentNum;
    }
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public String getIncidentStatus() {
        return incidentStatus;
    }

    public void setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
    }
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Deal{" +
            "incidentNum=" + incidentNum +
            ", priority=" + priority +
            ", incidentStatus=" + incidentStatus +
            ", processor=" + processor +
        "}";
    }
}
