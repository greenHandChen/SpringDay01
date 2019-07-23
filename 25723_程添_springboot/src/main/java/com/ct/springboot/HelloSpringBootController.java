package com.ct.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {
    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String sayHello() {
        return helloSpringBoot.sayHello();
    }
}
