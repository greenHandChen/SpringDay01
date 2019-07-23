package com.hand.springboot_25034_yanzhen.Controller;

import com.hand.starter.config.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String sayHello(){
        System.out.println("测试开始。。。。。。。。。。。。。。。。。。。");
        System.out.println("输出："+helloSpringBoot.sayHello());
        return helloSpringBoot.sayHello();
    }
}
