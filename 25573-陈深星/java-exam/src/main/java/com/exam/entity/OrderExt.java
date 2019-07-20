package com.exam.entity;

import java.util.List;

public class OrderExt extends Order {

    private String username;

    private String address;

    private User user;

    // 一对多映射
    private List<OrderDetail> orderDetailList;

    // Getter & Setter
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

    public User getUser() {

        return user;

    }

    public void setUser(User user) {

        this.user = user;

    }

    public List<OrderDetail> getOrderDetailList() {

        return orderDetailList;

    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {

        this.orderDetailList = orderDetailList;

    }
}
