package com.example.myproject.controller;

import com.txz.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    private HelloSpringBoot helloSpringBoot;

    @GetMapping("/helloSpringBoot")
    public String helloSpring(){
        return helloSpringBoot.sayHello();
    }

}
