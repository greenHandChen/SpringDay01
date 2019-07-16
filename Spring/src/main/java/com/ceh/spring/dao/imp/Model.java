package com.ceh.spring.dao.imp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository("myModel")
@Scope("prototype")
public class Model {
    public void catSay() {
        System.out.println("hehe");
    }



}
