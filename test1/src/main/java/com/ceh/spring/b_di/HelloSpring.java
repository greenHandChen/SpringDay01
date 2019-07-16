package com.ceh.spring.b_di;

import lombok.Data;

/**
 * Created by HuangHeng on 2019/7/16
 */
@Data
public class HelloSpring {
    private String info;

    private DISpring diSpring;

    public void ininMethod(){
        System.out.println("HelloSpring ininMethod");
    }
    public void destoryMethod(){
        System.out.println("HelloSpring destoryMethod");
    }
}
