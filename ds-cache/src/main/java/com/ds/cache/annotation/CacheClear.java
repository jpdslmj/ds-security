package com.ds.cache.annotation;

import com.ds.cache.parser.IKeyGenerator;
import com.ds.cache.parser.impl.DefaultKeyGenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)//在运行时可以获取  
@Target(value = {ElementType.METHOD, ElementType.TYPE})//作用到类，方法，接口上等
public @interface CacheClear {
    /**
     * 缓存key的前缀
     */
    public String pre() default "";

    /**
     * 缓存key
     */
    public String key() default "";

    /**
     * 缓存keys
     */
    public String[] keys() default "";

    /**
     * 键值解析类
     */
    public Class<? extends IKeyGenerator> generator() default DefaultKeyGenerator.class;
}
