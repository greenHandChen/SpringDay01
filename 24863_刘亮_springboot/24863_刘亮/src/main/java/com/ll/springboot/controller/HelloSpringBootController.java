package com.ll.springboot.controller;

import com.ll.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package com.ll.springboot.controller
 * @Author LL
 * @ClassName HelloSpringBootController
 * @Date 2019/7/23  19:37
 */
@RestController
public class HelloSpringBootController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHello("hello");

    }


}
