package com.hand.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my.hello")
public class SayHello {

    public String salHello(){
        String say = "hello springboot";
        System.out.println(say);
        return say;
    }
}
