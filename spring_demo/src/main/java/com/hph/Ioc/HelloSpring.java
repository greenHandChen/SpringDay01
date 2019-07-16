package com.hph.Ioc;

public class HelloSpring {

    private String info;

    private DISpring diSpring;

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void initBean(){
        System.out.println("初始化bean");
    }

    public void destroyBean(){
       System.out.println("销毁bean");
    }
}
