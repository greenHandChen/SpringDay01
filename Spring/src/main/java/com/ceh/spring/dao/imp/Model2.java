package com.ceh.spring.dao.imp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("myModel2")
@Scope("singleton")
public class Model2 {

    public void dogSay() {
        System.out.println("haha");
    }

    @PostConstruct
    public void construct() {
        System.out.println("construct Mode2");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destory Mode2");
    }
}
