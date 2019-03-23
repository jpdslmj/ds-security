package com.github.lmj.security.common.exception.auth;


import com.github.lmj.security.common.constant.CommonConstants;
import com.github.lmj.security.common.exception.BaseException;


public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
