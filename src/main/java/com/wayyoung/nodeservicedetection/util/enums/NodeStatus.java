package com.wayyoung.nodeservicedetection.util.enums;


import com.wayyoung.nodeservicedetection.util.enums.EnumIntegerInterface;
public enum NodeStatus implements EnumIntegerInterface<NodeStatus> {

    UNKNOWN(-1, false, "未知"),
    /**
     * 现在没有新建的状态，新建完直接就是生效中的
     */
    NEW(0, false, "新建"),
    NOT_STARTED(1, false, "未开始"),
    PROGRESSING(2, true, "进行中"),
    END(3, true, "已结束"),
    OFFLINE(4, true, "已下架"),;

    private final int code;

    /**
     * 是否可以获得权益
     */
    private final boolean canAcquire;

    private final String desc;

    NodeStatus (int code, boolean canAcquire, String desc) {
        this.code = code;
        this.canAcquire = canAcquire;
        this.desc = desc;
    }


    public boolean isCanAcquire() {
        return canAcquire;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public int getValue() {
        return code;
    }

    @Override
    public NodeStatus genEnumByIntValue(Integer intValue) {
        if (intValue == null) {
            return UNKNOWN;
        }
        for (NodeStatus item: NodeStatus.values()) {
            if (item.code == intValue)
                return item;
        }
        return UNKNOWN;
    }
}
