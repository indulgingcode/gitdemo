package com.lzh.javase.annotation;

import org.junit.Test;

import java.util.Arrays;


// 使用反射进行注解解析
public class AnnotationBook {

    @Test
    public void parseAnnotationBook(){
        // 1、获取类对象
        Class c = BookStore.class;
        // 2、判断类对象上是否存在注解
        if (c.isAnnotationPresent(Book.class)){
            // 3、若存在则获取注解
            Book book = (Book) c.getAnnotation(Book.class);
            System.out.println(book.values() + " ===> " + Arrays.toString(book.authors()));
        }
    }
}

@Book(values = "《Java SE》", authors = {"A Foreign", "A Teacher"})
class BookStore {

}