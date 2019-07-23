package com.hand.controller;

import com.hand.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private SayHelloService sayHelloService;

    @RequestMapping("/helloSpringBoot")
    @ResponseBody
    public String sayHello(){
        return sayHelloService.sayHello();
    }

    @RequestMapping("/helloSpringBoot/to")
    @ResponseBody
    public String sayHelloToMe(){
        return sayHelloService.sqlHelloDetail();
    }


}
