package com.zt.spring.d_di2.by_setter;


public class SpringInfo2 {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "SpringInfo2{" +
                "info='" + info + '\'' +
                '}';
    }

}
