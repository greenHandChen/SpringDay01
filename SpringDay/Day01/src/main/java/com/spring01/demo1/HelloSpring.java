package com.spring01.demo1;

/**
 * Created by wangjie_fourth on 2019/7/16.
 */
public class HelloSpring {

    private String info = "生命周期！";

    private DISpring diSpring;

    public void initBean(){
        System.out.println("数据库连接配置完成");
    }

    public void destroyBean(){
        System.out.println("当前数据库连接已被关闭");
    }

    public String helloDI(){
        return "这是DI演示";
    }

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
}
