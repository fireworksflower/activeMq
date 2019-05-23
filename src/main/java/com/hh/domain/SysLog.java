package com.hh.domain;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/5/15 22:16
 **/
public class SysLog {
    private  Long id;
    private Date visitTime;//访问时间
    private String username;//操作者用户名
    private String ip;//访问ip
    private String url;//访问资源url
    private Long executionTime;//执行时长
    private String method;//访问方法

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
