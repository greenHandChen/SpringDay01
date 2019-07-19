package com.ll.mybatis.po;

import java.util.List;

public class OrderExt extends Orders {

    private String username;

    private String sex;

    //用户信息
    private User user;

    //订单明细信息
    private List<Ordersdetail> ordersdetails;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "OrderExt{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
