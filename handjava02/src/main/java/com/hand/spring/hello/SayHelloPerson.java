package com.hand.spring.hello;

import org.springframework.stereotype.Component;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/16 17:09
 */
@Component("sayHello")
public class SayHelloPerson {
    public void sayHello()
    {
        System.out.println("say hello");
    }
}
