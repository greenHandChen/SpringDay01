package com.wzh.controller;

import com.wzh.spring_boot_starter_hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/helloSpringboot")
    public String helloSpringboot() {
        return helloService.sayHello();
    }
}
