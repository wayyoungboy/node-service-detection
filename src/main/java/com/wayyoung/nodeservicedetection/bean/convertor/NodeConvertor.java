package com.wayyoung.nodeservicedetection.bean.convertor;

import com.wayyoung.nodeservicedetection.bean.NodeBean;
import com.wayyoung.nodeservicedetection.bean.VO.NodeServiceVO;
import com.wayyoung.nodeservicedetection.bean.VO.NodeVO;
import org.assertj.core.util.Lists;

import java.util.List;

public class NodeConvertor {
//        public static List<NodeVO> bo2Vo(List<NodeBean> boList) {
//        List<NodeVO> result = Lists.newArrayList();
//        if (boList == null) {
//            return result;
//        }
//        for (NodeBean nodeBean : boList) {
//            result.add(bo2Vo(nodeBean));
//        }
//        return result;
//    }
    public static NodeBean vo2Bo(NodeVO vo) {
        if (vo == null) {
            return null;
        }

        NodeBean bo = new NodeBean();
        bo.setId(vo.getId());
        bo.setOwner(vo.getOwner());
        bo.setAddress(vo.getAddress());

        bo.setLivecycle(vo.getLivecycle());
        bo.setNodeStatus(NodeServiceConvertor.vo2Bo(vo.getNodeStatus()));
        return bo;
    }

}
