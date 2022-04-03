package com.lzh.javase.annotation;

import java.util.ArrayList;
import java.util.List;

// 若要让继承的类中具有注解，需要使用元注解@Inherited
// 若要在运行时使用注解，需要使用@Retention(RetentionPolicy.RUNTIME)，否则以下输出均为false，且存在警告
public class AnnotationDemo extends testInherited{
    public AnnotationDemo(){
        super();
        System.out.println("AnnotationDemo: " + AnnotationDemo.class.isAnnotationPresent(Demo.class));
    }

    @Deprecated
    public void discardMethod(){}

    @SuppressWarnings("all")     // 忽略所有警告
    public static void main(String[] args) {
        AnnotationDemo demo = new AnnotationDemo();
        demo.discardMethod();     // 编译器会提示不建议使用
        List list = new ArrayList();
    }
}

// 特殊属性value，可不指定属性名称
@Demo(5)
class testInherited{
    public testInherited() {
        System.out.println("testInherited: " + testInherited.class.isAnnotationPresent(Demo.class));
    }
}