package com.example.springboot;

import huanglehao.study.service.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 20:24 2019/7/23
 */
@RestController
public class SayHello {

    @Autowired
    StarterService starterService;

    @RequestMapping("/helloSpringBoot")
    public String sayHello(){
        return  starterService.getMsg();
    }
}
