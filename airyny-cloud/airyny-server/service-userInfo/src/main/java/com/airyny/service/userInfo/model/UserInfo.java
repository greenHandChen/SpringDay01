package com.airyny.service.userInfo.model;

/**
 * @Author:Yonye
 * @Date:2019/7/26 11:14
 * @Version:1.0
 * @deseription:
 **/
public class UserInfo {
    private Integer id;
    private Integer user_id;
    private String hobby;
    private double height;
    private double weight;
    private String skill;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", hobby='" + hobby + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", skill='" + skill + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
