package com.example.service2.Controller;

import com.example.service2.feign.HelloClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {
    @Autowired
    private HelloClient helloClient;
    @HystrixCommand(fallbackMethod = "failtohello")
    @RequestMapping("/hello2")
    public String hello(){
        throw new RuntimeException();
        //return helloClient.hello();
    }

    public String failtohello(){
        return "发生异常Hystrix启动";
    }
}
