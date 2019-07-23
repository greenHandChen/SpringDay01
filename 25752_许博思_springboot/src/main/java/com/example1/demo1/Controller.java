package com.example1.demo1;

import club.osai.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private HelloSpringBoot helloSpringBoot;
    @RequestMapping("/hello")
    public String hello()
    {

        return  helloSpringBoot.sayHello();
    }


}
