package com.example.demo.controller;

import com.mystarter.BootHelloService;
import com.mystarter.BootHelloTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloSpringBoot")
public class TestController  {
    @Autowired(required = false)
    private BootHelloTest bootHelloTest;

    @RequestMapping(method = RequestMethod.GET,path="")
    public String printInfo()
    {
        return (this.bootHelloTest.HelloSpringBoot().sayHello());
    }
}
