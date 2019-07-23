package com.zt._25781_zhangtong_springboot.controller;

import com.zt.spring_boot_starter_hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-23 20:11
 */
@RestController
public class StarterController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/helloSpringBoot")
    public String index() {
        return helloService.sayHello();
    }
}
