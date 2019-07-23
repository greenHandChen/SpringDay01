package com.yhk.springboot;

import com.yhk.hellospringbootstarter1.HelloServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloServiceConfiguration helloServiceConfiguration;

    @GetMapping("/helloSpringBoot")
    public String Hello(){
        System.out.println(helloServiceConfiguration.getStr());
        return helloServiceConfiguration.sayHello();
    }
}
