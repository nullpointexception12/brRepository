package com.brhkq.enterprise.model;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Date createTime;

    private Date updateTime;

    private Date failureTime;

    private String disableIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
    }

    public String getDisableIp() {
        return disableIp;
    }

    public void setDisableIp(String disableIp) {
        this.disableIp = disableIp;
    }
}