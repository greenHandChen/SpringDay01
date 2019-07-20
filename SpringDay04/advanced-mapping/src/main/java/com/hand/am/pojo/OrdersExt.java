package com.hand.am.pojo;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/19 9:19
 **/
public class OrdersExt extends Orders {
    private String username;
    private String address;
    private User user;
    private List<OrderDetail> orderDetailList;

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", orderDetailList=" + orderDetailList +
                "} " + super.toString();
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
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


}
