package com.github.lmj.security.auth.configuration;

import com.github.lmj.security.auth.interceptor.ClientTokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FeignConfiguration {
    @Bean
    ClientTokenInterceptor getClientTokenInterceptor(){
        return new ClientTokenInterceptor();
    }
}
