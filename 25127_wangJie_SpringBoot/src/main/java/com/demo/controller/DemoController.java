package com.demo.controller;

import com.my.starter.function.DemoFuncation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangjie_fourth on 2019/7/23.
 */
@Controller
public class DemoController {

    @Autowired
    private DemoFuncation demoFuncation;

    @GetMapping("/helloSpringBoot")
    @ResponseBody
    public String initDemoFuncation(){
        return demoFuncation.sayHello();
    }
}
