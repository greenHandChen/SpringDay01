package com.hand.springboot.controller;

import com.hand.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by HuangHeng on 2019/7/23
 */
@RestController
public class HelloController {
    @Autowired
    HelloSpringBoot helloSpringBoot;

    @RequestMapping("helloSpringBoot")
    public String hello(){
       return  helloSpringBoot.sayHello();
    }
}
