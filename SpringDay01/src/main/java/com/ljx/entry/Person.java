package com.ljx.entry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    private Integer id;
    @Value("李四注解方式")
    private String name;
    @Value("26")
    private int age;

    public Person(){}
    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



}
