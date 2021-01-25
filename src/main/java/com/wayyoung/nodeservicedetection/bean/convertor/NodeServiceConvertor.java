package com.wayyoung.nodeservicedetection.bean.convertor;

import com.wayyoung.nodeservicedetection.bean.NodeServiceBean;
import com.wayyoung.nodeservicedetection.bean.VO.NodeServiceVO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NodeServiceConvertor {
    public static List<NodeServiceBean> vo2Bo(List<NodeServiceVO> vos) {
        if (vos == null) {
            return new ArrayList<>();
        }
        return vos.stream().map(NodeServiceConvertor::vo2Bo).collect(Collectors.toList());
    }
    public static NodeServiceBean vo2Bo(NodeServiceVO vo) {
        if (vo == null) {
            return null;
        }
        NodeServiceBean bo = new NodeServiceBean();
        bo.setId(vo.getId());
        bo.setServiceName(vo.getServiceName());
        bo.setOwner(vo.getOwner());
        bo.setVersion(vo.getVersion());

        return bo;
    }
//    public static List<NodeServiceVO> bo2Vo(List<NodeServiceBean> bos) {
//        if (bos == null) {
//            return new ArrayList<>();
//        }
//        return bos.stream().map(NodeServiceConvertor::bo2Vo).collect(Collectors.toList());
//    }
}
