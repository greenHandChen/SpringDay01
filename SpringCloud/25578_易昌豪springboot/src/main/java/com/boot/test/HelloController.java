package com.boot.test;


import com.mystarter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/helloSpringBoot")
    public String sayHello(){
        return helloService.sayHello();
    }
}
