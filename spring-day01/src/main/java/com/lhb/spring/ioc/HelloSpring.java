package com.lhb.spring.ioc;

import com.lhb.spring.di.DISpring;

/**
 * Created By LHB on 2019/7/16;
 */
public class HelloSpring {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setDISpring(DISpring diSpring) {

    }

    public String helloDI() {
        return "hello Spring DI";
    }
}
