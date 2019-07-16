package com.zt.spring.d_di2.by_constructor;


public class SpringInfo {
    private String info;

    public SpringInfo(String info) {
        super();
        this.info = info;
    }

    @Override
    public String toString() {
        return "SpringInfo2{" +
                "info='" + info + '\'' +
                '}';
    }

}
