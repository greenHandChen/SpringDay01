package com.hand.domain;

import java.util.List;

public class OrdersExt extends Orders{
    private String username;
    private String address;
    private User user;//一对一映射
    private Items items;
    private List<OrderDetail> orderDetails;//一对多映射，需要使用集合对象
    private Float total_amount;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                "number='" + getId() + '\'' +
                "name='" + items.getName() + '\'' +
                "price='" + items.getPrice() + '\'' +
                "createtime='" + items.getCreatetime() + '\'' +
                ", total_amount=" + total_amount +
                '}';
    }
}

