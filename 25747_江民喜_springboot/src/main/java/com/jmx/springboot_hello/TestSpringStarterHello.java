package com.jmx.springboot_hello;

import com.jmx.spring_boot_starter_hello.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:
 * @Date:created in
 * @Description:
 */
@RestController
public class TestSpringStarterHello {
    @Autowired
    HelloSpringBoot helloSpringBoot;
    @RequestMapping("/helloSpringBoot")
    public String testSaySpringBoot(){
        return helloSpringBoot.sayHello();
    }
}
