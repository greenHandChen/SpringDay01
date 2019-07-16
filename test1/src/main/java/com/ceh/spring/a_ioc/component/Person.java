package com.ceh.spring.a_ioc.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by HuangHeng on 2019/7/16
 */
@Component("person1")
@Scope("prototype")
public class Person {
    public void sayHello(){
        System.out.println("Here is a component");
    }
}
