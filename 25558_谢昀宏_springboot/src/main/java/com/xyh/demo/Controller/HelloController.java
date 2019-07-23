package com.xyh.demo.Controller;

import com.xyh.Bean.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String helloSpringBoot(){
        return helloSpringBoot.sayHello();
    }
}
