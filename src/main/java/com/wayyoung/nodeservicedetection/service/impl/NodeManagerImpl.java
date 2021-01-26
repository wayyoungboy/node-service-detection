package com.wayyoung.nodeservicedetection.service.impl;

import com.wayyoung.nodeservicedetection.bean.NodeBean;
import com.wayyoung.nodeservicedetection.service.NodeManager;
import org.springframework.beans.factory.annotation.Autowired;

public class NodeManagerImpl implements NodeManager {
    @Override
    public long upsert(NodeBean promBean) {

    }
    @Override
    public long upsertInLock(NodeBean promBean){

    }
}
