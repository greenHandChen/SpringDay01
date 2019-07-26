package com.lhb.service2;

import com.lhb.service2.feign.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By LHB on 2019/7/22;
 */
@RestController
public class DemoController {

    @Autowired
    private HelloClient helloClient;

    @RequestMapping("/hello2")
    public String hello(){
        return helloClient.Hello("aaa");
    }
}
