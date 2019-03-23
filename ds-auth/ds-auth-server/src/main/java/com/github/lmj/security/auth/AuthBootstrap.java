package com.github.lmj.security.auth;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.github.lmj.security.auth.mapper")
//@EnableAutoConfiguration
public class AuthBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(AuthBootstrap.class, args);
    }
}
