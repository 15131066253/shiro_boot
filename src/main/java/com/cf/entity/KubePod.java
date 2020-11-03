package com.cf.entity;

import java.util.Date;

public class KubePod {
    private Integer id;

    private String podName;

    private String dnsPolicy;

    private String restartPolicy;

    private String schedulerName;

    private String serviceAccount;

    private String podIp;

    private String nodeInfoName;

    private String nodeInfoIp;

    private String state;

    private Date startTime;

    private Integer oid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public String getPodIp() {
        return podIp;
    }

    public void setPodIp(String podIp) {
        this.podIp = podIp;
    }

    public String getNodeInfoName() {
        return nodeInfoName;
    }

    public void setNodeInfoName(String nodeInfoName) {
        this.nodeInfoName = nodeInfoName;
    }

    public String getNodeInfoIp() {
        return nodeInfoIp;
    }

    public void setNodeInfoIp(String nodeInfoIp) {
        this.nodeInfoIp = nodeInfoIp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}