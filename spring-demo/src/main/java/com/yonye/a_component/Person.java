package com.yonye.a_component;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    public void sayHello(){
        System.out.println("hello i'm component!");
    }
}
