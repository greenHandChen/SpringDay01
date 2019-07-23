package com.springbootdemo;

import com.hand.springbootstaterhello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloSpringboot {

    @Autowired
    private HelloService service;
    @RequestMapping("/helloSpringBoot")
    public String hello(){
       return service.sayHello();
    }
}
