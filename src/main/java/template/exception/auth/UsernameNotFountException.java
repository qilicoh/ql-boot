package template.exception.auth;

import template.common.enums.ResultCodeEnum;
import template.exception.BusinessException;

public class UsernameNotFountException extends BusinessException {
    public UsernameNotFountException() {
        super(ResultCodeEnum.USERNAME_NOT_FOUNT);
    }
}
