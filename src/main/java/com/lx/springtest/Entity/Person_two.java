package com.lx.springtest.Entity;

import org.springframework.stereotype.Component;

@Component("person_two")
public class Person_two {
    public void sayHello(){
        System.out.println("hello,boy");
    }
}
