package com.ceh.spring.d_lifeCycle;

/**
 * Created by enHui.Chen on 2019/7/16.
 */

public class HelloSpring {
    private String info;

    public void init(){
        System.out.println("数据库连接配置完毕");
    }

    public void destory(){
        System.out.println("关闭连接，关闭系统资源");
    }

    public void service(){
        System.out.println("bean已经装配好了");
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
