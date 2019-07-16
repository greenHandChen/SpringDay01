package com.wzh.controller;

import com.wzh.pojo.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Autowired
    Hello hello;
    @RequestMapping("/test")
    public void test(){
        hello.setInfo("欢迎来到芜湖");
        System.out.println(hello.getInfo());
    }

}
