package com.zhang.springboot24807.controller;

import com.hand.HelloSpringBoot;
import com.hand.HelloSpringBootConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:SpringHelloController
 * Author:ZhangChunjia
 * Date:2019/7/23 20:15
 */
@Controller
@EnableAutoConfiguration
public class SpringHelloController {
    @Autowired
    private HelloSpringBootConfiguration helloSpringBootConfiguration;

    @RequestMapping("helloSpringBoot")
    @ResponseBody
    public String testHelloSpringBoot(){

        return helloSpringBootConfiguration.showHelloSpringBoot();
    }

}
