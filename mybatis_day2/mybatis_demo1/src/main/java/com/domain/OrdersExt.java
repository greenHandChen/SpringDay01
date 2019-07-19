package com.domain;

import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 9:01 2019/7/19
 * @Modified By:
 */
public class OrdersExt extends Orders {

    //继承Order,用来查询的类
    private String username;
    private String sex;

    //以Orders为主表,连接user表，一对一关系
    private User user;

    //以Orders为主表，连接orderDetail表，一对多关系
    private List<OrderDetail> orderDetailList;

    //以Orders为主表
    private List<Items> itemsList;

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "OrdersExt{" + super.toString()+
                ",username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", user=" + user +
                ", orderDetailList=" + orderDetailList +
                ", itemsList=" + itemsList +
                '}';
    }
}
