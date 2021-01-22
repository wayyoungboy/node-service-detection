package com.wayyoung.nodeservicedetection.bean;

public class NodeStatuBean {
    /**
     * CPU名称
     */
    private String cpuName;
    /**
     * cpu占用量
     */
    private int cpuConsumption;
    /**
     * 内存总量
     */
    private long menTotal;
    /**
     * 内存占用
     */
    private long menUsed;
    /**
     * 保留字段
     */
    private String otherInfo;
    /**
     * 节点版本
     */
    private long version;

}
