package com.mybatis.pojo;

import java.util.List;

/**
 * @description: 订单表的拓展Pojo
 * @author: xueWu.Chen
 * @create: 2019-07-19
 **/

public class OrderEx extends Order {
    private String username;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private List<Orderdetail> orderdetails;

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
