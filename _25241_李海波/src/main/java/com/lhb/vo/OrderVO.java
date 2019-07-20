package com.lhb.vo;

import com.lhb.domain.Orders;
import com.lhb.domain.User;

public class OrderVO extends Orders {
    private String username;
    private String address;

    @Override
    public String toString() {
        return "OrderVO{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
