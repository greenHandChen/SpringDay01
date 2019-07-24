package com.mystarter;


public class HelloService {
    private String str = "hello springboot";

    public String sayHello() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
