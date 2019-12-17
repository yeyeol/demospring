package com.imooc.demospring.entity;

import java.util.Date;

/**
 * @author linckye
 */
public class Area {
    private Integer areaId;
    private String areaName;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;

    public Integer getAreaId() {
        return areaId;
    }

    public Area setAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }

    public String getAreaName() {
        return areaName;
    }

    public Area setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public Area setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Area setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public Area setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
        return this;
    }
}
