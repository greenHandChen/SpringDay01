package com.hand.entity;

import java.util.List;

/**
 * ClassName:OrdersExt
 * Author:ZhangChunjia
 * Date:2019/7/19 9:49
 */
public class OrdersExt extends Orders {
    private String username;
    private String address;
    //一对一映射
    private User user;
    //一对多映射
    List<OrderDetails> orderDetails;

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderdetails) {
        this.orderDetails = orderdetails;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                "} " + super.toString();
    }
}
