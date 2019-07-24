package com.example.demo.controller;

import com.hand.mike.hellospringbootstarter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo01 {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/helloSpringBoot")
    public String getHelloMsg(){
        System.out.println("hello！！！");
        return helloService.getMsg();
    }

}
