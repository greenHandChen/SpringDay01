package com.lhb.spring.di;

/**
 * Created By LHB on 2019/7/16;
 */
public class DISpring {
    private  String DiSpring;

    public String getDiSpring() {
        return DiSpring;
    }

    public void setDiSpring(String diSpring) {
        DiSpring = diSpring;
    }

    public void setHelloSpring(DISpring helloSpring) {
        System.out.println("hello Spring-DI");
    }
}
