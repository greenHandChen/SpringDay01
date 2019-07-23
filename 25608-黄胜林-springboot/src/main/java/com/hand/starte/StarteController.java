package com.hand.starte;

import com.hand.spring_boot_starter_hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StarteController {

    @Autowired
    private HelloService helloService;

    @PostMapping(value = "/ip:port/helloSpringBoot" )
    public String demo(){

        return helloService.sayHello();
    }

}
