package com.wayyoung.nodeservicedetection.bean;
/**
 *
 *
 * @author wangxuyan
 * @date 2021/1/7
 */
public class ServiceResult<T> {

    private boolean success;

    private int code;

    private String msg;

    public ServiceResult(){
    }

    public ServiceResult(boolean success, int code, String msg) {
        this(success, code, msg, null);
    }

    public ServiceResult(boolean success, int code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 返回的结果
     */
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ServiceResult [code=" + code + ", msg=" + msg + ", data="+ data + "]";
    }
}
