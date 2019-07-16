package com.frank.spring.demo04;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    public void sayHello(){
        System.out.println("I'm a Component!!!");
    }
}
