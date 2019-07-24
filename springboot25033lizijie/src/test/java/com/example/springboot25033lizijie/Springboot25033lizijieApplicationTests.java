package com.example.springboot25033lizijie;

import com.example.springbootstarterhello.config.HelloSpringBoot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot25033lizijieApplicationTests {

    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @Test
    public void contextLoads() {
    }

    @Test
    public void rere(){
        System.out.println(helloSpringBoot.sayHello());
    }
}
