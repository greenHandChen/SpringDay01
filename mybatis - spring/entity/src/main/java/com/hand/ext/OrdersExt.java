package com.hand.ext;

import com.hand.pojo.Orders;

public class OrdersExt extends Orders {
    private  String username;
    private  String address;

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