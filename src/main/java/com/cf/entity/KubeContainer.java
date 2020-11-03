package com.cf.entity;

public class KubeContainer {
    private Integer id;

    private String image;

    private String imagePullPolicy;

    private String name;

    private String portsContainerPort;

    private String portsName;

    private String portsProtocol;

    private String limitsCpu;

    private String limitsMemory;

    private String requestsCpu;

    private String requestsMemory;

    private String terminationMessagePath;

    private String terminationMessagePolicy;

    private String volumeMountsMountPath;

    private String volumeMountsName;

    private String volumeMountsReadOnly;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortsContainerPort() {
        return portsContainerPort;
    }

    public void setPortsContainerPort(String portsContainerPort) {
        this.portsContainerPort = portsContainerPort;
    }

    public String getPortsName() {
        return portsName;
    }

    public void setPortsName(String portsName) {
        this.portsName = portsName;
    }

    public String getPortsProtocol() {
        return portsProtocol;
    }

    public void setPortsProtocol(String portsProtocol) {
        this.portsProtocol = portsProtocol;
    }

    public String getLimitsCpu() {
        return limitsCpu;
    }

    public void setLimitsCpu(String limitsCpu) {
        this.limitsCpu = limitsCpu;
    }

    public String getLimitsMemory() {
        return limitsMemory;
    }

    public void setLimitsMemory(String limitsMemory) {
        this.limitsMemory = limitsMemory;
    }

    public String getRequestsCpu() {
        return requestsCpu;
    }

    public void setRequestsCpu(String requestsCpu) {
        this.requestsCpu = requestsCpu;
    }

    public String getRequestsMemory() {
        return requestsMemory;
    }

    public void setRequestsMemory(String requestsMemory) {
        this.requestsMemory = requestsMemory;
    }

    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public String getVolumeMountsMountPath() {
        return volumeMountsMountPath;
    }

    public void setVolumeMountsMountPath(String volumeMountsMountPath) {
        this.volumeMountsMountPath = volumeMountsMountPath;
    }

    public String getVolumeMountsName() {
        return volumeMountsName;
    }

    public void setVolumeMountsName(String volumeMountsName) {
        this.volumeMountsName = volumeMountsName;
    }

    public String getVolumeMountsReadOnly() {
        return volumeMountsReadOnly;
    }

    public void setVolumeMountsReadOnly(String volumeMountsReadOnly) {
        this.volumeMountsReadOnly = volumeMountsReadOnly;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}