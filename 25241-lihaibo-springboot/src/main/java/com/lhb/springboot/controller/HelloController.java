package com.lhb.springboot.controller;

import com.lhb.bean.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created By LHB on 2019/7/23;
 */
@RestController
public class HelloController {

    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return helloSpringBoot.sayHello( name + " , " );
    }
    @RequestMapping("/helloSpringBoot/{name}")
    @ResponseBody
    public String hello1(@PathVariable(value = "name") String name) {
        return helloSpringBoot.sayHello( name + " , " );
    }
}
