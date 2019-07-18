package com.demo.spring;

public class InintClass {
    private String info="生命周期！";
    public void initBean(){
        System.out.println("数据库配置完成");
    }
    public void destoryBean(){
        System.out.println("当前数据库连接已被关闭");
    }
}
