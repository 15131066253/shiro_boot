package com.cf.entity;

public class KubeOperator {
    private Integer id;

    private String svcName;

    private String namespace;

    private String clusterip;

    private String type;

    private String nodeSelectorAppnode;

    private String replicas;

    private String strategyType;

    private String strategyMaxSurge;

    private String strategyMaxUnavailable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSvcName() {
        return svcName;
    }

    public void setSvcName(String svcName) {
        this.svcName = svcName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getClusterip() {
        return clusterip;
    }

    public void setClusterip(String clusterip) {
        this.clusterip = clusterip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNodeSelectorAppnode() {
        return nodeSelectorAppnode;
    }

    public void setNodeSelectorAppnode(String nodeSelectorAppnode) {
        this.nodeSelectorAppnode = nodeSelectorAppnode;
    }

    public String getReplicas() {
        return replicas;
    }

    public void setReplicas(String replicas) {
        this.replicas = replicas;
    }

    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType;
    }

    public String getStrategyMaxSurge() {
        return strategyMaxSurge;
    }

    public void setStrategyMaxSurge(String strategyMaxSurge) {
        this.strategyMaxSurge = strategyMaxSurge;
    }

    public String getStrategyMaxUnavailable() {
        return strategyMaxUnavailable;
    }

    public void setStrategyMaxUnavailable(String strategyMaxUnavailable) {
        this.strategyMaxUnavailable = strategyMaxUnavailable;
    }
}