package com.hand.controller;

import com.hand.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 定义Controller
 * @author Fandelu
 */
@Controller
public class MyController {

    /**
     * 定义SayHelloService对象
     */
    @Autowired
    private SayHelloService sayHelloService;

    /**
     * 调用sayHello方法，将文本输出在控制台中，同时返回控制台输出的文本
     * @return "hello springboot"
     */
    @RequestMapping("/helloSpringBoot")
    @ResponseBody
    public String sayHello(){
        return sayHelloService.sayHello();
    }

    /**
     * 使用配置文件自定义输出内容
     * @return 控制台输出的内容
     */
    @RequestMapping("/helloSpringBoot/to")
    @ResponseBody
    public String sayHelloToMe(){
        return sayHelloService.sqlHelloDetail();
    }


}
