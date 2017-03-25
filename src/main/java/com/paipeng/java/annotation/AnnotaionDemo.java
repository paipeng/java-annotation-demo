package com.paipeng.java.annotation;

import java.lang.reflect.Method;

/**
 * Created by paipeng on 25/03/2017.
 */
public class AnnotaionDemo {
    public AnnotaionDemo() {
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Annotation");
        Test test = new Test();
        test.sayHello();
        Method m = test.getClass().getMethod("sayHello");
        System.out.println("Hello " + m.getAnnotation(MyAnnotation.class).value());
    }

}
