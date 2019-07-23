package com.lzn.customied_starter.imp;

import com.lzn.customied_starter.IHelloSpringBoot;

public class HelloSpringBoot implements IHelloSpringBoot {
    @Override
    public String sayHello() {
        return "hello springboot";
    }
}
