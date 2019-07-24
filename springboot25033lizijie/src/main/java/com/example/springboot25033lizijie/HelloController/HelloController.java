package com.example.springboot25033lizijie.HelloController;


import com.example.springbootstarterhello.config.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String sayHello(){
        return helloSpringBoot.sayHello();
    }
}
