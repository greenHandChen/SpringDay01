package com.hand.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myTeacher")
public class Teacher {
    @Value("1001")
    private Integer t_id;
    @Value("李老师")
    private String t_name;

    public Teacher() {
    }

    public Teacher(Integer t_id, String t_name) {
        this.t_id = t_id;
        this.t_name = t_name;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                '}';
    }
}
