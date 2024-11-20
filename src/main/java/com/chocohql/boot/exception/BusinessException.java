package com.chocohql.boot.exception;

import com.chocohql.boot.common.enums.ResultCodeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessException extends RuntimeException {
    private ResultCodeEnum resultCodeEnum;

    public BusinessException(ResultCodeEnum resultCodeEnum) {
        this.resultCodeEnum = resultCodeEnum;
    }
}
