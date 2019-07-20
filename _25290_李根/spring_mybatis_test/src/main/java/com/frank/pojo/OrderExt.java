package com.frank.pojo;

import java.util.List;

public class OrderExt extends Order {
    private String username;
    private String address;

    private User user;
    private List<Orderdetail> list;

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
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    public List<Orderdetail> getList() {
        return list;
    }

    public void setList(List<Orderdetail> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return super.toString()+"OrderExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", list=" + list +
                '}';
    }
}
