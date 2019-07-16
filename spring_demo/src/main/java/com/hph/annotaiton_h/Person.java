package com.hph.annotaiton_h;

import org.springframework.stereotype.Component;

@Component("person01")
public class Person {
    public void sayHello() {
        System.out.println("this is component!");
    }
}
