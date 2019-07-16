package com.lhb.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * Created By LHB on 2019/7/16;
 */
@Component("person1")
public class Person {
    public void sayHello(){
        System.out.println("hello I am compaent!");
    }
}
