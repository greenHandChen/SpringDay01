package com.jqh;

public class FirstSpring {

    private String info = "生命周期";

    private DISpring diSpirng;

    public void initBean(){
        System.out.println("初始化");
    }

    public void destoryBean(){
        System.out.println("销毁");
    }

    public String getInfo() {
        return info;
    }

    public DISpring getDiSpirng() {
        return diSpirng;
    }

    public void setDiSpirng(DISpring diSpirng) {
        this.diSpirng = diSpirng;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void helloDI(){
        System.out.println(diSpirng.getDI());
    }
}
