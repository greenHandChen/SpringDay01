package com.ceh.spring.f_annotation;


import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    public void say(){
        System.out.println("say test @component");
    }
}
