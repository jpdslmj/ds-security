package com.github.lmj.security.gate;

import com.github.lmj.security.gate.utils.DBLog;
import com.github.lmj.security.auth.client.EnableAceAuthClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableAceAuthClient
@EnableFeignClients({"com.github.lmj.security.auth.client.feign","com.github.lmj.security.gate.feign"})
public class GatewayServerBootstrap {
    public static void main(String[] args) {
        DBLog.getInstance().start();
        SpringApplication.run(GatewayServerBootstrap.class, args);
    }
}
