package com.ceh.spring.b_di;

public class DiSpring {
    private String info;

    // alt+insert
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void helloDI(String msg) {
        this.info = msg;
    }
}
