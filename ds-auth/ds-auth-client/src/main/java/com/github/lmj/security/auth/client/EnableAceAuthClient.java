package com.github.lmj.security.auth.client;

import com.github.lmj.security.auth.client.configuration.AutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AutoConfiguration.class)
@Documented
@Inherited
public @interface EnableAceAuthClient {

}
