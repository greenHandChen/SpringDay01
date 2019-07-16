package com.sise.demo;

public class HelloSpring {
    private String info;
    private DISpring diSpring;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }
    public void initBean(){
        System.out.println("bean初始化");
    }

    public void destoryBean(){
        System.out.println("bean摧毁");
    }
}
