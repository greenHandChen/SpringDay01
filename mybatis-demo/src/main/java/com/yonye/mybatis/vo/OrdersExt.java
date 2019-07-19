package com.yonye.mybatis.vo;

import com.yonye.mybatis.pojo.Orderdetail;
import com.yonye.mybatis.pojo.Orders;
import com.yonye.mybatis.pojo.User;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/19 14:15
 * @Version:1.0
 * @deseription:
 **/
public class OrdersExt extends Orders implements Serializable {
    private String username;
    private String address;
    private User user;
    private List<Orderdetail> orderDetails;

    public List<Orderdetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<Orderdetail> orderDetails) {
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
}
