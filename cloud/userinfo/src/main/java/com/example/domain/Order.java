package com.example.domain;

import java.sql.Timestamp;

public class Order {
    private Integer id;
    private Integer userId;
    private  String number;
    private Timestamp creteTime;
    private String bote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Timestamp getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Timestamp creteTime) {
        this.creteTime = creteTime;
    }

    public String getBote() {
        return bote;
    }

    public void setBote(String bote) {
        this.bote = bote;
    }
}
