package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class User {

    // 用户编号（自增主键）
    private Integer id;

    private String username;
    private String password;

    public User() {

    };

    public User(String username, String password) {

        this.username = username;

        this.password = password;

    }

    // Getter & Setter
    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getUsername() {

        return username;

    }

    public void setUsername(String username) {

        this.username = username;

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    // toString
    @Override
    public String toString() {

        return "User {" +
                "id = " + id +
                ", username = '" + username + '\'' +
                ", password = '" + password + '\'' +
                '}';

    }

}
