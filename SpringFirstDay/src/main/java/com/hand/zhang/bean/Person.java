package com.hand.zhang.bean;

import org.springframework.stereotype.Component;

/**
 * ClassName:Person
 * Author:ZhangChunjia
 * Date:2019/7/16 18:46
 */
@Component("person1")
public class Person {
    public void sayHello(){
        System.out.println("hello");
    }
}
