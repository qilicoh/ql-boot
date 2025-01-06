package template.exception.auth;

import template.common.enums.ResultCodeEnum;
import template.exception.BusinessException;

public class PasswordErrorException extends BusinessException {
    public PasswordErrorException() {
        super(ResultCodeEnum.PASSWORD_ERROR);
    }
}
