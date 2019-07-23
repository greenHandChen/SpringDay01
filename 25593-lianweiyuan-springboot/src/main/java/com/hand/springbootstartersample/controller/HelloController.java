package com.hand.springbootstartersample.controller;

import com.hand.springbootstarterhelloworld.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/23 19:46
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/helloSpringBoot")
    public String sayHello(){
        return helloService.sayHello();
    }
}
