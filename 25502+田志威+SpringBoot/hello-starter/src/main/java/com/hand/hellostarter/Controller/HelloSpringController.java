package com.hand.hellostarter.Controller;

import com.hand.helloworld.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
public class HelloSpringController {

    @Autowired
    HelloService helloService;
    @RequestMapping("/HelloSpringBoot")
    public String hello(){
        return helloService.sayHello();
    }
}
