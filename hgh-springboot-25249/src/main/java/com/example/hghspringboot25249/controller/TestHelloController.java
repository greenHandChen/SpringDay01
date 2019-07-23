package com.example.hghspringboot25249.controller;

import com.example.starter.bean.HelloSpringBoot;
import com.example.starter.config.MainConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
public class TestHelloController {

    @Autowired
    HelloSpringBoot helloSpringBoot;

    @RequestMapping("/sayhello")
    public String sayHello(){
        System.out.println(123);
        return helloSpringBoot.sayHello();
    }
}
