package com.github.lmj.security.common.exception.auth;


import com.github.lmj.security.common.constant.CommonConstants;
import com.github.lmj.security.common.exception.BaseException;


public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
