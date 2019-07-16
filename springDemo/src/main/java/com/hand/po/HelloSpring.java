package com.hand.po;

import org.springframework.stereotype.Component;

@Component
public class HelloSpring {
    private String info ="生命周期";

    public DiSpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DiSpring diSpring) {
        this.diSpring = diSpring;
    }

    private DiSpring diSpring;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void  sayHello(){
        System.out.println("this is helloSpring");
    }
    public String helloDI(){
        return diSpring.hello();
    }
    public void initBean(){
        System.out.println("配置完成");
    }
    public void destoryBean(){
        System.out.println("连接关闭");
    }
}
