package com.masirhh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class addressBean {

    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public addressBean() {
    }

    @Autowired
    private studentBean stu;

    @PostConstruct
    public void Oncreate() {
        System.out.println("adressBean is Creating!");
    }

    @PreDestroy
    public void Ondestroy() {
        System.out.println("addressBean is Destroying!");
    }

    public void outaddress() {
        System.out.println(stu.out());
    }

    @Override
    public String toString() {
        return "addressBean{" +
                "id=" + id +
                ", stu=" + stu +
                '}';
    }
}
