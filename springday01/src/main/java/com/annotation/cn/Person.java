package com.annotation.cn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("person1")
@Scope("prototype")
public class Person {
    public void sayHello(){
        System.out.println("hello i am component!");
    }
}
