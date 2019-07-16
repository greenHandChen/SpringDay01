package com.masirhh.beans;

import org.springframework.stereotype.Component;

@Component
public class studentBean {

    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "studentBean{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public studentBean(){};


    public String  out(){
        return "This is a studentBean";
    }


}
