package com.example.springbootstarterhello.config;

public class HelloSpringBoot {
    private String msg;

    public String sayHello() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}