package com.zt.spring.f_annotation;

import org.springframework.stereotype.Component;

@Component("springInfo")
public class SpringInfo {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
