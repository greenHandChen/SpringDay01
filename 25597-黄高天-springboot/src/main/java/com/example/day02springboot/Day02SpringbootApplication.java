package com.example.day02springboot;

import com.wisely.springboot_starter_hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@SuppressWarnings("all")
public class Day02SpringbootApplication {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/helloSpringboot")
    public String index(){

        return helloService.sayHello();
    }
    public static void main(String[] args) {

        SpringApplication.run(Day02SpringbootApplication.class, args);
    }

}
