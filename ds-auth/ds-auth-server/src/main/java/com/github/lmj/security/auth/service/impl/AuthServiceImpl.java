package com.github.lmj.security.auth.service.impl;

import com.github.lmj.security.auth.vo.UserInfo;
import com.github.lmj.security.auth.common.util.jwt.JWTInfo;
import com.github.lmj.security.auth.feign.IUserService;
import com.github.lmj.security.auth.service.AuthService;
import com.github.lmj.security.auth.util.user.JwtAuthenticationRequest;
import com.github.lmj.security.auth.util.user.JwtTokenUtil;
import com.github.lmj.security.common.exception.auth.UserInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AuthServiceImpl implements AuthService {

    private JwtTokenUtil jwtTokenUtil;
    private IUserService userService;

    @Autowired
    public AuthServiceImpl(
            JwtTokenUtil jwtTokenUtil,
            IUserService userService) {
        this.jwtTokenUtil = jwtTokenUtil;
        this.userService = userService;
    }

    @Override
    public String login(JwtAuthenticationRequest authenticationRequest) throws Exception {
        UserInfo info = userService.validate(authenticationRequest);
        if (!StringUtils.isEmpty(info.getId())) {
            return jwtTokenUtil.generateToken(new JWTInfo(info.getUsername(), info.getId() + "", info.getName()));
        }
        throw new UserInvalidException("用户不存在或账户密码错误!");
    }

    @Override
    public void validate(String token) throws Exception {
        jwtTokenUtil.getInfoFromToken(token);
    }

    @Override
    public String refresh(String oldToken) throws Exception {
        return jwtTokenUtil.generateToken(jwtTokenUtil.getInfoFromToken(oldToken));
    }
}
