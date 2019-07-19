package com.xyh.mybaits.Entity;

import java.util.List;

public class OrdersExt extends Orders {

    private String username;
    private String sex;
    private User user;
    private List<OrderDetail> orderDetails;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return super.toString()+"OrdersExt{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                '}'+user.toString();
    }
}
