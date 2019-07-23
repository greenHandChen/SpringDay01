package com.lzn._25596linzhennanspringboot.controller;

import com.lzn.customied_starter.IHelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private IHelloSpringBoot helloSpringBoot;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
       return helloSpringBoot.sayHello();
    }
}
