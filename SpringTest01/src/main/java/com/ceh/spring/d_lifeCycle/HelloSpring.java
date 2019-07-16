package com.ceh.spring.d_lifeCycle;


import com.ceh.spring.b_di.DiSpring;

public class HelloSpring {
    private String info;
    private DiSpring diSpring1;

    // init
    public void init() {
        System.out.println("init");
    }

    // destroy
    public void destroy(){
        System.out.println("destroy");
    }

    // alt+insert
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public DiSpring getDiSpring1() {
        return diSpring1;
    }

    public void setDiSpring1(DiSpring diSpring1) {
        this.diSpring1 = diSpring1;
    }

    public void service() {
        System.out.println("service");
    }
}
