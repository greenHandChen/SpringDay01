package com.yonye.spring;

public class HelloSpring {

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info="生命周期！！";

    public void initBean(){
        System.out.println("数据库连接配置完成");
    }

    public void destoryBean(){
        System.out.println("当前数据库连接已被关闭");
    }
}
