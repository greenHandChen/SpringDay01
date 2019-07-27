package com.example.service.dto;

import javax.persistence.*;

@Entity
@Table(name = "user_demo")
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String userSex;


    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
