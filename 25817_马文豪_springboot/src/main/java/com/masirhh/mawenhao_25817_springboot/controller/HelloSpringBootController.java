package com.masirhh.mawenhao_25817_springboot.controller;


import com.masirhh.myspringbootstarter.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

    @Autowired
    HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String helloSpringBoot(){
        return helloSpringBoot.sayHello();
    }
}
