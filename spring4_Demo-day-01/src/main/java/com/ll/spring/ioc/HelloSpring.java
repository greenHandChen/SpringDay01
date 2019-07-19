package com.ll.spring.ioc;

public class HelloSpring {
    private String info;

    private DISpring diSpring;

    private int count = 0;
    public void add(){
        this.count++;
    }

    public HelloSpring() {
    }

    public HelloSpring(String info) {
        this.info = info;
    }

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

    public void service(){
        System.out.println("bean 配置完毕");
    }

    public void initMethod(){
        System.out.println("Hello Spring Bean init! 数据库连接配置完毕！");
    }

    public void destoryMethod(){
        System.out.println("Hello Spring Bean destory! 回收系统资源中");
    }
}
