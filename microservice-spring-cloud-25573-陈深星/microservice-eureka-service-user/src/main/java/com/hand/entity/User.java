package com.hand.entity;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键自增策略
    private Integer id;

    private String username;
    private String password;

    private Integer userInfoId;

    @Transient
    private String infoa;

    @Transient
    private String infob;

    public User() {

       super();

    }

    public User(String username, String passworwd) {

        this.username = username;

        this.password = passworwd;
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

    public Integer getUserInfoId() {

        return userInfoId;

    }

    public void setUserInfoId(Integer userInfoId) {

        this.userInfoId = userInfoId;

    }

    public String getInfoa() {

        return infoa;

    }

    public void setInfoa(String infoa) {

        this.infoa = infoa;

    }

    public String getInfob() {

        return infob;

    }

    public void setInfob(String infob) {

        this.infob = infob;

    }

}
