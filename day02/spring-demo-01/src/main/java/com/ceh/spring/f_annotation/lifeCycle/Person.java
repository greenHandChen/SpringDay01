package com.ceh.spring.f_annotation.lifeCycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
@Component
@Scope("prototype")
public class Person {
    private String name;
    private Integer age;
    private String address;

    public Person() {
        super();
    }

    public Person(String name, Integer age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
