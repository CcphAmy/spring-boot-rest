package com.company.project.core.exception;

/**
 * @Author: CcphAmy
 * @Date: 2019\1\8 0008 23:46
 * @Version 1.0
 */
public class ServiceExcetion extends RuntimeException {

    private Integer code;
    private String message;

    public ServiceExcetion(ServiceExcetionEnum serviceExcetionEnum) {
        this.code = serviceExcetionEnum.getCode();
        this.message = serviceExcetionEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
