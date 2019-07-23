package com.hand.controller;

import com.hand.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiongyilin
 * @Date 2019/7/23 22:42
 * @Version 1.0
 */


@RestController
@SpringBootApplication
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/HelloSpringBoot")
    public String sayHello() {
       return helloService.sayHello();
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}