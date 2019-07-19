package com.lx.mybatis.Entity;

import java.util.List;

public class OrdersExt2 extends Orders{

    private User user;

    // 一对多映射，需要使用集合对象
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
}
