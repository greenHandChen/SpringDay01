package com.frank.springboottest.controller;

import com.frank.HelloSpringBootConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestController {
    @Autowired
    HelloSpringBootConfiguration helloSpringBoot;
    @RequestMapping("/hello")
    public String helloSpringboot(){
        return helloSpringBoot.sayHello();
    }


}
