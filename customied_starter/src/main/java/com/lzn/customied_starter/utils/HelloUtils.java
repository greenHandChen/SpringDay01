package com.lzn.customied_starter.utils;

import com.lzn.customied_starter.IHelloSpringBoot;
import com.lzn.customied_starter.imp.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

public class HelloUtils {

    @Autowired
    private IHelloSpringBoot helloSpringBoot;


    public String sayHello() {
        if (null == helloSpringBoot) {
            return null;
        }
        return helloSpringBoot.sayHello();
    }

}
