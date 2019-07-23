package com.hand.starter.config;

public class HelloSpringBoot {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String sayHello(){
        return msg;
    }
}
