package com.hand.zhangtianle.Controller;

import com.hand.hello.HelloSpringBoot;
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
