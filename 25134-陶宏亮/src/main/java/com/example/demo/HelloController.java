package com.example.demo;

import com.example.simplestarter.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ExampleService exampleService;

    @RequestMapping("/helloSpringBoot")
    public String hello(){
        return  exampleService.sayHello();
    }
}
