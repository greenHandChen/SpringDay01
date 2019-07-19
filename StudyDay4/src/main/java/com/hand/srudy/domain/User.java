package com.hand.srudy.domain;

import java.util.Date;

/**
 * @Author xiongyilin
 * @Date 2019/7/19 20:06
 * @Version 1.0
 */

public class User  {
    private Long userId;
    private String username;
    private Date date;
    private String sex;
    private String address;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}