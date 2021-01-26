package com.wayyoung.nodeservicedetection.bean;

import lombok.Data;

import java.util.List;
@Data
public class NodeBean {
    private long id;

    /**
     * 所属集群，如：way-hass
     *
     * create table TB_NODE_INFO(
     *      `Id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
     *      'Owner'varchar(128) NOT NULL DEFAULT '' COMMENT '上级所属',
     *      `Status` int(11) NOT NULL DEFAULT '0' COMMENT '节点状态：1-在线, 2-离线',
     *     `TimeFirst` bigint(20) NOT NULL DEFAULT '0' COMMENT '首次注册时间',
     *     `Address` bigint(20) NOT NULL DEFAULT '0' COMMENT '节点地址',
     *          `Servicesid` bigint(20) NOT NULL DEFAULT '0' COMMENT '节点地址',
     *      PRIMARY KEY (`Id`),
     *       KEY `idx_promId` (`Owner`)
     * )ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8mb4 COMMENT='节点信息表';
     *
     * create table TB_NODE_INFO
     * (
     * 	Id bigint unsigned auto_increment,
     * 	Owner varchar(128) default  null comment '上级所属',
     * 	Status int default 0 not null,
     * 	TimeFirst bigint default 0 not null,
     * 	servicesId bigint default 0 not null comment '节点地址',
     * 	Address bigint not null,
     * 	constraint TB_NODE_INFO_pk
     * 		primary key (Id),
     * 	constraint TB_NODE_INFO_pk_2
     * 		unique (Owner, Status)
     * )
     * comment '节点信息表';
     */

    private long owner;
    /**
     * 节点地址。如：10.12.11.37
     */
    private String address;

    /**
     * 节点所包含的服务
     */
    //private List<NodeServiceBean> nodeStatus;
   private List<NodeServiceBean> services;
    /**
     * 最近注册时间
     */

    private long timeFirst;
    //操作：1.首次注册；2.增加注册服务；3.减少注册服务；4.刷新注册服务
    //private List<Integer>


}
