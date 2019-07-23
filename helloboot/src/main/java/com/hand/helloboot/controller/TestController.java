package com.hand.helloboot.controller;

import com.hand.service.HelloBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestController {

    @Autowired
    private HelloBootService helloBootService;

    @RequestMapping("helloSpringBoot")
    @ResponseBody
    public String test(){
        return helloBootService.sayHello();
    }
}
