package com.wayyoung.nodeservicedetection.util.enums;


public enum ServiceCode {

    SUCCESS(200, "成功"),
    DEFAULT_ERROR(400, "系统错误"),

    // 业务错误码
    NOT_PROMOTION_TIME(60001, "不在活动期间"),

    // 轻会员订单同步错误码
    ORDER_SYNC_INVALID_PARAM(40001, "参数有误"),
    DUPLICATE_OUT_BIZ_NO(40002, "重复的业务单号(订单号或退款单号)"),
    PRICE_ILLEGAL(40003, "金额关系错误"),
    ITEM_NUM_LIMIT(40004, "商品数量超出最大限制"),

    // 轻会员结算错误码
    SETTLE_INVALID_PARAM(50001, "参数有误"),
    AGREEMENT_EXPIRED(50002, "用户协议失效"),
    PAY_AMOUNT_CHECK_ERROR(50003, "商家支付金额大于冻结金额"),
    ORDER_ALREADY_DEAL(50004, "订单超时，系统已自动处理完成"),
    BEYOND_PAY_RESTRICTION(50005, "商户收款额度超限"),
    BUYER_ENABLE_STATUS_FORBID(50006, "买家状态非法"),
    BUYER_PAYMENT_AMOUNT_DAY_LIMIT(50007, "买家付款日限额超限"),
    CONCURRENT_OPERATION_ERROR(50008, "协议正在结算时，并发操作发生错误"),
    INVALID_SETTLEMENT_INFO(50009, "无效的结算累计数据");

    private int code;

    private String msg;

    public static ServiceCode genEnumByIntValue(int value) {
        for (ServiceCode item: ServiceCode.values()) {
            if (item.getCode() == value) {
                return item;
            }
        }
        return DEFAULT_ERROR;
    }

    ServiceCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }}
