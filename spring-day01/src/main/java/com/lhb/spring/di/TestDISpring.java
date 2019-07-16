package com.lhb.spring.di;

import com.lhb.spring.ioc.HelloSpring;
import org.junit.Test;

/**
 * Created By LHB on 2019/7/16;
 */
public class TestDISpring {
    @Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        DISpring diSpring = new DISpring();
        helloSpring.setDISpring(diSpring);
        System.out.println(helloSpring.helloDI());

    }
}
