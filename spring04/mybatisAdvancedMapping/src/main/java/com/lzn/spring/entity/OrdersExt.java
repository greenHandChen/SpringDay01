package com.lzn.spring.entity;

import java.util.List;

public class OrdersExt extends OrdersEntity{
    private String username;
    private String address;

    // 一对一
    private UserEntity user;

    // 一对多
    private List<OrderDetailEntity> orderDetails;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                super.toString() +
                (null == user ? ", user = null" : "," + user.toString()) +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                (null == orderDetails ? ", orderDetails = null" : "," + orderDetails.toString()) +
                '}';
    }
}
