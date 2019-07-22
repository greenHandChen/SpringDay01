package com.ceh.mybatis.domain;


import java.util.List;

/**
 * Created by enHui.Chen on 2019/7/9.
 */
public class OrdersExt extends Orders {

    private String username;

    private String address;

    private User user;// 一对一映射

    private List<OrderDetail> orderDetails;// 一对多映射，需要使用集合对象

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    @Override
    public String toString() {
        return "OrdersExt{" +
                "id='" + super.getId() + '\'' +
                "number='" + super.getNumber() + '\'' +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
