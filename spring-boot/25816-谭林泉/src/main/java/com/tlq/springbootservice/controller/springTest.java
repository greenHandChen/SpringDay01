package com.tlq.springbootservice.controller;


import com.tlq.hellostarter.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试控制器
 * @Author: TanLinQuan
 * @Date: 2019/7/23 20:02
 * @Version: V1.0
 **/
@RestController
public class springTest {

    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @GetMapping("/helloSpringBoot")
    public String test() {
        return helloSpringBoot.sayHello();
    }
}
