package com.hand.pojo;

import java.util.List;

/**
 * @author dingwensheng
 * @description: 创建order扩展类
 * @date
 */
public class OrdersExt extends Orders{


    private User user;
    private List<OrderDetail> orderDetails;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "user=" + user +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
