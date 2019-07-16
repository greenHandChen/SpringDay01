package com.spring.cn;

public class HelloSpring {
    private  String info="生命周期";
    private DiSpring di;
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public void setDI(DiSpring di) {
        this.di = di;
    }
    public DiSpring  getDi(){
        return di;
    }
    public void initBean(){
        System.out.println("初始化方法");
    }
    public void destroyBean(){
        System.out.println("销毁方法");
    }
}
