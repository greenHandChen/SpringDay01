package com.yonye.springboot.test_springboot.controller;

import com.yonye.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Yonye
 * @Date:2019/7/23 20:09
 * @Version:1.0
 * @deseription:
 **/

@RestController
public class HelloController {
    @Autowired
    HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String sayHello(){
      return   helloSpringBoot.sayHello();
    }
}
