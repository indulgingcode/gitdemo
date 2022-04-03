package com.lzh.javase.annotation;

import java.lang.annotation.*;

// https://www.runoob.com/w3cnote/java-annotation.html

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Demo {
    String printClassName() default "NULL";
    int value();
}
