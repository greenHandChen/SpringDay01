package com.example.demo;

import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    User user;

    @Autowired
    ApplicationContext ctx;

    @Test
    public void contextLoads() {

        System.out.println(ctx.containsBean("user"));

        System.out.println(user.toString());
        
    }

}
