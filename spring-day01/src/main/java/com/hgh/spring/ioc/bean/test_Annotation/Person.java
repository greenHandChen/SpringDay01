package com.hgh.spring.ioc.bean.test_Annotation;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    public void sayHallo(){
        System.out.println("ha lo wo de");
    }
}
