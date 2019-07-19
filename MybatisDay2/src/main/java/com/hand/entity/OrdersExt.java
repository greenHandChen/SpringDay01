package com.hand.entity;

import java.util.List;

public class OrdersExt extends Orders {

    private String username;
    private String address;

    private User user;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    private List<OrderDetail> orderDetails;

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
    public String toString(){

        String string = "订单id" + this.getId() + "\n"
                      + "用户id" + this.getUser_id() + "\n"
                      + "数量" + this.getNumber() + "\n"
                      + "订单时间" + this.getCreatetime() + "\n"
                      + "备注" + this.getNote() + "\n"
                      + "用户名" + user.getUsername() + "\n"
                      + "地址" + user.getAddress();
        return string;
    }

}
