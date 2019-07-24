package zengbuhui25510springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zbh.hand.HelloSpringBoot;

/**
 * @author: wuhui
 * @time: 2019/7/24 8:27
 * @desc:
 */
@RestController
public class HelloSpringBootController {
    @Autowired
    HelloSpringBoot helloSpringBoot;
    @GetMapping("/helloSpringboot")
    public String hello(){

        return helloSpringBoot.sayHello();
    }
}
