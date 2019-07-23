package com.hand.springboot.controller;

import com.hand.starter.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    HelloSpringBoot helloSpringBoot;


    @GetMapping("/hello")
    public String sayHello() {

        return helloSpringBoot.sayHello();

    }


}
