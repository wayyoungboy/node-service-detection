package com.wayyoung.nodeservicedetection.beans;

import lombok.Data;
/**
 * @author wangxuyan
 * @date 2021/1/7
 */
@Data
public class RestNodeLogInDTO {
    /**
     * 业务结果，SUCCESS/FAIL	是	SUCCESS
     */
    private String resultCode;
    /**
     * 错误的具体code	否	PRODUCTID_NOT_EXIST
     */
    private String Number;
    /**
     * 错误信息描述	否	PRODUCTID不存在
     */
    private String errMsg;
}
