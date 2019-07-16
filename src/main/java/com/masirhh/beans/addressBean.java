package com.masirhh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class addressBean {

    @Autowired
    private studentBean stu;

    public void outaddress(){
        System.out.println(stu.out());
    }

}
