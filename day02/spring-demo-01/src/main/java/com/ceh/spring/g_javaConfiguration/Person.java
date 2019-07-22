package com.ceh.spring.g_javaConfiguration;

import org.springframework.stereotype.Component;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
public class Person {
    private String name;
    private Integer age;
    private String address;
    private Student student;


    public Person() {
        super();
    }

    public Person(String name, Integer age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", student=" + student +
                '}';
    }
}
