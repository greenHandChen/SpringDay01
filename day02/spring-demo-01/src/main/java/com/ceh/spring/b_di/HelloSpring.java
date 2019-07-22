package com.ceh.spring.b_di;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by enHui.Chen on 2019/7/16.
 */

public class HelloSpring {
    private String info;
    private DISpring diSpring;

    public void helloDI(String msg) {
        this.diSpring.helloDI(msg);
    }

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
