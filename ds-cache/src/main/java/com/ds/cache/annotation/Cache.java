package com.ds.cache.annotation;

import com.ds.cache.constants.CacheScope;
import com.ds.cache.parser.ICacheResultParser;
import com.ds.cache.parser.IKeyGenerator;
import com.ds.cache.parser.impl.DefaultKeyGenerator;
import com.ds.cache.parser.impl.DefaultResultParser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 开启缓存
 */
@Retention(RetentionPolicy.RUNTIME)
// 在运行时可以获取
@Target(value = {ElementType.METHOD, ElementType.TYPE})
// 作用到类，方法，接口上等
public @interface Cache {
    /**
     * 缓存key menu_{0.id}{1}_type
     */
    public String key() default "";

    /**
     * 作用域
     */
    public CacheScope scope() default CacheScope.application;

    /**
     * 过期时间
     */
    public int expire() default 720;


    public String desc() default "";

    /**
     * 返回类型
     */
    public Class[] result() default Object.class;

    /**
     * 返回结果解析类
     */
    public Class<? extends ICacheResultParser> parser() default DefaultResultParser.class;

    /**
     * 键值解析类
     */
    public Class<? extends IKeyGenerator> generator() default DefaultKeyGenerator.class;
}
