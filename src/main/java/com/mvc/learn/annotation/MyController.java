package com.mvc.learn.annotation;

import java.lang.annotation.*;

/**
 * @author: gaoxu
 * @date: 2018/8/16
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {

    /**
     * 表示给controller注册别名
     *
     * @author: gaoxu
     * @date: 2018/8/16
     */
    String value() default "";
}
