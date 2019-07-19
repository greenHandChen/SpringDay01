package com.domain;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 10:59 2019/7/19
 * @Modified By:
 */
public class OrderDetailExt extends OrderDetail {
    //继承Order,用来查询的类
    private String username;
    private String sex;

    private User user;

    private String userid;
    private String number;

    private Orders orders;

    @Override
    public String toString() {
        return "OrderDetailExt{" + super.toString()+
                ",username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", user=" + user +
                ", userid='" + userid + '\'' +
                ", number='" + number + '\'' +
                ", orders=" + orders +
                '}';
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
