package com.lx.mybatis.Entity;

public class OrdersExt extends Orders {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return super.toString() + "OrdersExt{" +
                "user=" + user +
                '}';
    }
}
