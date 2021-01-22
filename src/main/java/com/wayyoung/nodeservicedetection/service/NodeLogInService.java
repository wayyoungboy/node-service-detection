package com.wayyoung.nodeservicedetection.service;

import com.wayyoung.nodeservicedetection.bean.NodeBean;
import com.wayyoung.nodeservicedetection.beans.NodeLogInDTO;

public interface NodeLogInService {
    /**
     * 调用注册接口
     *
     */
    NodeBean nodeInfo();
    NodeBean queryById(long id);
    NodeLogInDTO LogIn(long id);
    void doLogin(long id);
    void delCache(long id);
}
