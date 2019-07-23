package com.hand.wangjunspringboot.controller;

import com.hand.hellostarter.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 王俊
 * @Date: 2019/7/23 19:38
 **/
@RestController
public class HelloController {
    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String helloSpringBoot() {
        return helloSpringBoot.sayHello();
    }
}
