package com.lx.springtest;

public class HelloSpring {
    private String info;

    String getInfo() {
        return info;
    }

    void setInfo(String info){
        this.info = info;
    }

    private void initBean(){
        System.out.println("初始化bean");
    }

    private void destory(){
        System.out.println("销毁bean");
    }
}
