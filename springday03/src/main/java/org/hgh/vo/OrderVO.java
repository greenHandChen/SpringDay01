package org.hgh.vo;

import org.hgh.pojo.Orders;
import org.hgh.pojo.User;

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
