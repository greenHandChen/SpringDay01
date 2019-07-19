package com.hand.wqw.vo;


import com.hand.wqw.domain.Orders;
import com.hand.wqw.domain.User;

public class OrderExt  extends Orders {

    private String username;
    private String address;

    private User user;

    @Override
    public String toString() {
        return "OrderExt{" +
                "id=" + super.getId() +
                ", userId=" + super.getUserId() +
                ", number='" + super.getNumber() + '\'' +
                ", createtime=" + super.getCreatetime() +
                ", note='" + super.getNote() + '\'' +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ",user{" +
                "id=" + user.getId() +
                ", username='" + user.getUsername() + '\'' +
                ", birthday=" + user.getBirthday() +
                ", sex='" + user.getSex() + '\'' +
                ", address='" + address + '\'' +
                '}' +
                "} ";
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
