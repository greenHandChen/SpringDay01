package com.example.userservice.entity;

public class User {
    private Integer id;
    private String username;
    private String email;
    private String sex;
    private Long countryId;
    private String countryName;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getCountryId() {
        return countryId;
    }

    public User setCountryId(Long countryId) {
        this.countryId = countryId;
        return this;
    }

    public String getCountryName() {
        return countryName;
    }

    public User setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public User() {

    }
}
