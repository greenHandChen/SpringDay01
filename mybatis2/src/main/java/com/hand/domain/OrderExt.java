package com.hand.domain;

import java.util.List;

public class OrderExt extends  Orders {
    private  String username;
    private String  address;
    private  User user;
    private List<OrderDetail> orderDetails;

    @Override
    public String toString() {
        return "OrderExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user.toString() +
                ", orderDetails=" + orderDetails.toString() +
                '}';
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
