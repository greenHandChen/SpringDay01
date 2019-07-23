package com.hand.springboot;

import com.hand.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @RequestMapping(value = "/helloSpringBoot")
    public String sayHello(){
        return helloSpringBoot.sayHello();
    }

}
