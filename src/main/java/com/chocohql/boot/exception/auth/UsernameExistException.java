package com.chocohql.boot.exception.auth;

import com.chocohql.boot.common.enums.ResultCodeEnum;
import com.chocohql.boot.exception.BusinessException;

public class UsernameExistException extends BusinessException {
    public UsernameExistException() {
        super(ResultCodeEnum.USERNAME_EXIST);
    }
}
