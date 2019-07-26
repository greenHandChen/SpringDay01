package com.hand.eureka.server.bean;

import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用户
 *
 * @author Fandelu
 */
public class User {

    private Integer id;//ID
    private String name;//姓名
    private Date birthday;//生日
    private Character gender;//性别

    public User() {
    }

    public User(String name, Date birthday, Character gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                '}';
    }
}
