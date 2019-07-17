package com.spring01.demo2.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by wangjie_fourth on 2019/7/16.
 */
@Component("person1")
@Scope("prototype")
public class Person {

    public void sayHello(){
        System.out.println("hello i'm component!");
    }
}
