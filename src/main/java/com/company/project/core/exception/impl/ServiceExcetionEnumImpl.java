package com.company.project.core.exception.impl;

import com.company.project.core.exception.ServiceExcetionEnum;

/**
 * @Author: CcphAmy
 * @Date: 2019\1\8 0008 23:59
 * @Version 1.0
 */
public enum ServiceExcetionEnumImpl implements ServiceExcetionEnum {

    /**
     * 用户
     */
    USER_LOGIN_NO(400, "用户未登陆");

    ServiceExcetionEnumImpl(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;

    @Override
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
