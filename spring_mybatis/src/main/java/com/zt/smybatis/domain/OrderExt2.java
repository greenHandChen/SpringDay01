package com.zt.smybatis.domain;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-19 11:10
 */
public class OrderExt2 extends Order {

    private String username;

    private String address;

    private User user;

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

    @Override
    public String toString() {
        return "OrderExt2{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                '}';
    }
}
