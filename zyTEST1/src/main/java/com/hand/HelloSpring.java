package com.hand;

public class HelloSpring {
    private String info;
    private DISpring diSpring;

    public String getInfo() {
        return info;
    }

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "info='" + info + '\'' +
                ", diSpring=" + diSpring +
                '}';
    }
}
