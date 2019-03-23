package com.github.lmj.security.auth.client.configuration;

import com.github.lmj.security.auth.client.config.ServiceAuthConfig;
import com.github.lmj.security.auth.client.config.UserAuthConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.github.lmj.security.auth.client"})
public class AutoConfiguration {
    @Bean
    ServiceAuthConfig getServiceAuthConfig(){
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig(){
        return new UserAuthConfig();
    }

}
