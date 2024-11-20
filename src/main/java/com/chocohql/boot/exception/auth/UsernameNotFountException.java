package com.chocohql.boot.exception.auth;

import com.chocohql.boot.common.enums.ResultCodeEnum;
import com.chocohql.boot.exception.BusinessException;

public class UsernameNotFountException extends BusinessException {
    public UsernameNotFountException() {
        super(ResultCodeEnum.USERNAME_NOT_FOUNT);
    }
}
