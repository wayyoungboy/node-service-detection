package com.wayyoung.nodeservicedetection.util.enums;

public interface EnumIntegerInterface<T> {

    /**
     * 获得当前枚举类的int值
     *
     * @return
     */
    public int getValue();

    /**
     * 根据intValue生成对应的Enum对象
     *
     * @param intValue
     * @return
     */
    public T genEnumByIntValue(Integer intValue);
}
