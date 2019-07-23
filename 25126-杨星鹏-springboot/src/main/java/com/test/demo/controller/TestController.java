package com.test.demo.controller;

import com.springboot.stater.stater.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
   @Autowired
    HelloSpringBoot helloSpringBoot;
    @GetMapping("hello")
   public String hello(){
       return helloSpringBoot.sayHello();
   }
}
