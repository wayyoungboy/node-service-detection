package com.wayyoung.nodeservicedetection.bean;

import java.util.List;

public class NodeBean {
    private long id;

    /**
     * 所属集群，如：way-hass
     */

    private long owner;
    /**
     * 节点地址。如：10.12.11.37
     */
    private String address;
    private List<NodeServiceBean> nodeStatus;
    /**
     * 节点所包含的服务
     */

    private List<NodeServiceBean> services;
    /**
     * 最近注册时间
     */

    private long timelast;
    //操作：1.首次注册；2.增加注册服务；3.减少注册服务；4.刷新注册服务
    //private List<Integer>
    /**
     * Node的存活校验周期；单位：秒
     */

    private long livecycle;

}
