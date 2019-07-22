package com.hand.spring_boot_day1.entity;

public class User {
    private String name;
    private Integer id;
    private String describtion;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", describtion='" + describtion + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public User(String name, Integer id, String describtion) {
        this.name = name;
        this.id = id;
        this.describtion = describtion;
    }

    public User() {
    }
}
