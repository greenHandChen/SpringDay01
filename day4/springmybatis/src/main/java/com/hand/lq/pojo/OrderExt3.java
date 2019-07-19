package com.hand.lq.pojo;

import java.util.List;

public class OrderExt3 extends Orders{
    String  username;
    String address;
    User user;
    List<OrderDetails> od;

    @Override
    public String toString() {
        return "OrderExt3{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", od=" + od +
                ", id=" + id +
                ", user_id=" + user_id +
                ", number='" + number + '\'' +
                ", createTime=" + createTime +
                ", note='" + note + '\'' +
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

    public List<OrderDetails> getOd() {
        return od;
    }

    public void setOd(List<OrderDetails> od) {
        this.od = od;
    }
}
