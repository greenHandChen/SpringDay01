package com.hand.pojo;

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
    public DISpring helloDI(){
       return diSpring;
    }
}
