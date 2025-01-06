package template.exception.auth;

import template.common.enums.ResultCodeEnum;
import template.exception.BusinessException;

public class UsernameExistException extends BusinessException {
    public UsernameExistException() {
        super(ResultCodeEnum.USERNAME_EXIST);
    }
}
