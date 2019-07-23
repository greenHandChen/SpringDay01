package com.cxw.springbootstartersample;

i
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootStarterSampleApplication {
    @Autowired
    private HelloSpringBoot helloSpringBoot;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterSampleApplication.class, args);
    }

    @RequestMapping("/helloSpringBoot")
    public String helloSpringBoot() {
        return helloSpringBoot.sayHello();
    }
}
