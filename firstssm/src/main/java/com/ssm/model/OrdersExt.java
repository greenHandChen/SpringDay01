package com.ssm.model;

import java.util.List;

/**
 *Create by minxi.jiang on 2019/7/19
 * @Decription:Orders的拓展类，用于描述订单和用户的信息
 * */
public class OrdersExt extends Orders{


     private String username;

        private String address;

    private User user;

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", orderdetails=" + orderdetails +
                '}';
    }

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    private List<Orderdetail> orderdetails;

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
