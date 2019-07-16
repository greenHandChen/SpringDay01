package com.hand.bean;

import org.springframework.stereotype.Component;

@Component("person1")
public class Persons {
    public void sayHello(){
        System.out.println("波妞，我是宗介");
    }
}
