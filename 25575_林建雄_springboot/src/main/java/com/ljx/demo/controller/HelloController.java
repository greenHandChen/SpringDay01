package com.ljx.demo.controller;

import com.ljx.config.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LinJianXiong
 * @Date 2019/7/23
 * @Time 20:19
 */
@RestController
public class HelloController {
   @Autowired
    HelloSpringBoot helloSpringBoot;


    @RequestMapping("/helloSpringBoot")
    public String hello(){
      return   helloSpringBoot.sayHello();
    }

}
