package com.sy.springboot.controller;

import com.sy.hellospringbootstarter.HelloAutoConfiguration;
import com.sy.hellospringbootstarter.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloSpringBoot helloSpringBoot;
    @RequestMapping("/helloSpringBoot")
    public String helloSpring(){

        return helloSpringBoot.sayHello();
    }
}
