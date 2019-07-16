package com.hgh.spring.ioc;

/**
 * Created By hgh on 2019/7/16;
 */
public class HelloSpring {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void init(){
        System.out.println("init.....");
    }

    public void destroy(){
        System.out.println("distroy...");
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "info='" + info + '\'' +
                '}';
    }
}
