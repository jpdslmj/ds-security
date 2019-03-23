package com.github.lmj.security.common.msg.auth;

import com.github.lmj.security.common.constant.RestCodeConstants;
import com.github.lmj.security.common.msg.BaseResponse;


public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
