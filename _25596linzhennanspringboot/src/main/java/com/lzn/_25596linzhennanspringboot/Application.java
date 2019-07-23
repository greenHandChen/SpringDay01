package com.lzn._25596linzhennanspringboot;

import com.lzn.customied_starter.IHelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {

    @Autowired
    private IHelloSpringBoot helloSpringBoot;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/say")
    @ResponseBody
    public String say() {
        return helloSpringBoot.sayHello();
    }

}
