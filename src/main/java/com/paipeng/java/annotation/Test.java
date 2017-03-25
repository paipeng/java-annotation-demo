package com.paipeng.java.annotation;

/**
 * Created by paipeng on 25/03/2017.
 */
public class Test {
    @MyAnnotation(value=100)
    public void sayHello() throws Exception {
        System.out.println("say Hello " + this.getClass().getMethod("sayHello").getAnnotation(MyAnnotation.class).value());
    }
}
