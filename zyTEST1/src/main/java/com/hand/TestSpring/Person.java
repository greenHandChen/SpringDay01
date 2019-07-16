package com.hand.TestSpring;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    public void SayHello(){
        System.out.println("你好！老吊！");
    }
}
