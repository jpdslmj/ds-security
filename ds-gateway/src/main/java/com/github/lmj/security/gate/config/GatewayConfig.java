package com.github.lmj.security.gate.config;

import com.github.lmj.security.gate.handler.RequestBodyRoutePredicateFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    RequestBodyRoutePredicateFactory requestBodyRoutePredicateFactory() {
        return new RequestBodyRoutePredicateFactory();
    }
}
