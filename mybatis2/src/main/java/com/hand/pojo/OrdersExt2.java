package com.hand.pojo;

import java.util.List;

/**
 * ClassName:OrdersExt2
 * Author:Hejunfeng
 * Date:2019/7/19 15:47
 */
public class OrdersExt2 extends Orders{
    private String username;
    private String address;
    private User user;
    private List<OrderDetail> orderDetail;

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

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "OrdersExt2{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", orderDetail=" + orderDetail +
                '}';
    }
}