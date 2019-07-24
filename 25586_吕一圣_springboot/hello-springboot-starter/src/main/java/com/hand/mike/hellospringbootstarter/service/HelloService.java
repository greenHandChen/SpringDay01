package com.hand.mike.hellospringbootstarter.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
