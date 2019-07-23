package com.hand.controller;

import com.hand.bean.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private SayHello sayHello;

    @RequestMapping("/helloSpringBoot")
    @ResponseBody
    public String sayHello(){
        return sayHello.salHello();
    }


}
