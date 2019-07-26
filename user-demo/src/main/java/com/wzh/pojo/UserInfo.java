package com.wzh.pojo;

public class UserInfo {
    private Double height;
    private Double weight;
    private String hobby;
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public UserInfo() {
    }

    public UserInfo(Double height, Double weight, String hobby) {
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
    }
}
