package com.github.lmj.security.auth.feign;

import com.github.lmj.security.auth.configuration.FeignConfiguration;
import com.github.lmj.security.auth.util.user.JwtAuthenticationRequest;
import com.github.lmj.security.auth.vo.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "ds-admin",configuration = FeignConfiguration.class)
public interface IUserService {
  @RequestMapping(value = "/api/user/validate", method = RequestMethod.POST)
  public UserInfo validate(@RequestBody JwtAuthenticationRequest authenticationRequest);
}
