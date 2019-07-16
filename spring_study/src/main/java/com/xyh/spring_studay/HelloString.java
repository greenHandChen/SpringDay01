package com.xyh.spring_studay;

public class HelloString {

    private String info;
    private DIString diString;

    public void init()
    {
        System.out.println("初始化中:HelloString");
    }

    public void destroy()
    {
        System.out.println("销毁");
    }

    public DIString helloDIString()
    {
        return diString;
    }

    public DIString getDiString() {
        return diString;
    }

    public void setDiString(DIString diString) {
        this.diString = diString;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
