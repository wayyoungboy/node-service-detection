package com.wayyoung.nodeservicedetection.bean.VO;

import lombok.Data;

@Data
public class NodeServiceVO {
    /**
     * 服务名
     */

    private long id;
    /**
     * 服务名称
     */

    private String serviceName;
    /**
     * 所属事物
     */
    private String owner;

    /**
     * 版本号
     */

    private long version;
}
