package template.exception;

import template.common.enums.ResultCodeEnum;
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
