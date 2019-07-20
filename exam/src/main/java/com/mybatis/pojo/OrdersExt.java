package com.mybatis.pojo;

import java.util.List;

public class OrdersExt extends Orders{
    private User user;
    private List<OrderDetail> orderDetails;
    private List<Items> items;
    private List<Orders> orders;

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "user=" + user +
                ", orderDetails=" + orderDetails +
                ", items=" + items +
                ", orders=" + orders +
                '}';
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
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
