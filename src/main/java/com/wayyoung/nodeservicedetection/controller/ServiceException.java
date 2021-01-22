package com.wayyoung.nodeservicedetection.controller;

import com.wayyoung.nodeservicedetection.util.enums.ServiceCode;

public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -6151599748478029036L;

    private ServiceCode code;

    public ServiceException() {
    }

    public ServiceException(ServiceCode code) {
        this.code = code;
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable t) {
        super(t);
    }

    public ServiceException(String message, Throwable t) {
        super(message, t);
    }

    public ServiceCode getCode() {
        return code;
    }
}