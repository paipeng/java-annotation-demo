package com.paipeng.java.annotation;

import java.lang.annotation.*;

/**
 * Created by paipeng on 25/03/2017.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int value();
}
