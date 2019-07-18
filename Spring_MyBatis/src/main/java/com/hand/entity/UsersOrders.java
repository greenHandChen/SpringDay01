package com.hand.entity;

import java.util.Date;
import java.util.Set;

public class UsersOrders {
    private Integer user_id;
    private String username;
    private Date birthday;
    private Character sex;
    private String address;
    private Set<Orders> ordersList;

    public UsersOrders() {
    }

    public UsersOrders(Integer user_id, String username, Date birthday, Character sex, String address, Set<Orders> ordersList) {
        this.user_id = user_id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.ordersList = ordersList;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(Set<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "UsersOrders{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }
}
