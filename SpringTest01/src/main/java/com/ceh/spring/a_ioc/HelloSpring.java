package com.ceh.spring.a_ioc;

import com.ceh.spring.b_di.DiSpring;

public class HelloSpring {
    private String info;
    private DiSpring diSpring1;

    /*public void helloDI(String msg){
        this.diSpring1.helloDI(msg);
    }
*/
    public void helloDI(String msg){
        System.out.println(msg);
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
}
