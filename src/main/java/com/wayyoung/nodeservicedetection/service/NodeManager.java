package com.wayyoung.nodeservicedetection.service;

import com.wayyoung.nodeservicedetection.bean.NodeBean;

public interface NodeManager {
    /**
     * 增加或更新活动信息(包括合作方信息)
     *
     * @param promBean
     * @return 节点Id
     */
    long upsert(NodeBean promBean);

    long upsertInLock(NodeBean promBean);
}
