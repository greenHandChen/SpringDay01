package com.hand;

public class HelloSpring {
    private String info;
    private DISpring diSpring;

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "info='" + info + '\'' +
                '}';
    }
}
