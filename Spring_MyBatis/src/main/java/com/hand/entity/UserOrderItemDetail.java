package com.hand.entity;

public class UserOrderItemDetail {
    private User user;
    private Orders orders;
    private Items items;
    private OrderDetail detail;

    public UserOrderItemDetail() {
    }

    public UserOrderItemDetail(User user, Orders orders, Items items, OrderDetail detail) {
        this.user = user;
        this.orders = orders;
        this.items = items;
        this.detail = detail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public OrderDetail getDetail() {
        return detail;
    }

    public void setDetail(OrderDetail detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "UserOrderItemDetail{" +
                "user=" + user +
                ", orders=" + orders +
                ", items=" + items +
                ", detail=" + detail +
                '}';
    }
}
