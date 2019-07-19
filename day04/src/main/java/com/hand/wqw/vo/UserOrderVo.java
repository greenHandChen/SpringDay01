package com.hand.wqw.vo;

import com.hand.wqw.domain.Orders;
import com.hand.wqw.domain.User;

import java.util.List;

public class UserOrderVo extends User {
    private List<Orders> orders;

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "UserOrderVo{" +
                "orders=" + orders +
                "} " + super.toString();
    }
}
