package com.wayyoung.nodeservicedetection.controller;


import com.wayyoung.nodeservicedetection.bean.ServiceResult;
import com.wayyoung.nodeservicedetection.util.enums.ServiceCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BaseController {
    private static Logger logger = LoggerFactory.getLogger(BaseController.class);

    public <T> ServiceResult<T> success(T data) {
        ServiceResult<T> result = new ServiceResult<>();
        result.setSuccess(true);
        result.setCode(ServiceCode.SUCCESS.getCode());
        result.setMsg(null);
        result.setData(data);
        return result;
    }

    public <T> ServiceResult<T> failure(ServiceCode code, String msg) {
        ServiceResult<T> result = new ServiceResult<>();
        result.setSuccess(false);
        result.setCode(code.getCode());
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResponseEntity handleException(Exception ex) {
        if (ex == null) {
            logger.error("[op:handleException] exception is null");
            return yxError(null);
        } else if (ex instanceof ServiceException) {
            logger.error("[op:handleException] service exception", ex);
            return yxError((ServiceException) ex);
        } else {
            logger.error("[op:handleException] unexpected exception", ex);
            return yxError(null);
        }
    }

    private ResponseEntity yxError(ServiceException ex) {
        // 获得code
        ServiceCode code;
        if (ex == null) {
            code = ServiceCode.DEFAULT_ERROR;
        } else if (ex.getCode() == null) {
            code = ServiceCode.DEFAULT_ERROR;
        } else {
            code = ex.getCode();
        }

        // 返回错误码
        ServiceResult<Void> result = failure(code, code.getMsg());
        return ResponseEntity.status(200).contentType(MediaType.APPLICATION_JSON_UTF8).body(result);
    }
}