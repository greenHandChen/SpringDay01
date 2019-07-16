package com.frank.spring.demo01;

public class HelloSpring {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void init(){
        System.out.println("spring初始化完毕");
    }
    public void destroy(){
        System.out.println("spring被销毁");
    }
}
