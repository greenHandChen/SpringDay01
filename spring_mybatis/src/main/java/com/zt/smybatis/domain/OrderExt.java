package com.zt.smybatis.domain;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-19 11:10
 */
public class OrderExt extends Order {

    private String username;

    private String address;

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
        return "OrderExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
