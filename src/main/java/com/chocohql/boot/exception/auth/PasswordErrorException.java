package com.chocohql.boot.exception.auth;

import com.chocohql.boot.common.enums.ResultCodeEnum;
import com.chocohql.boot.exception.BusinessException;

public class PasswordErrorException extends BusinessException {
    public PasswordErrorException() {
        super(ResultCodeEnum.PASSWORD_ERROR);
    }
}
