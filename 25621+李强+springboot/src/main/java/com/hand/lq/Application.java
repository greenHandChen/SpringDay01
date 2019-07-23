package com.hand.lq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
    @Autowired
    HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String sayHello() {
        return helloSpringBoot.sayHello();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
