package com.hand.entity;

import java.util.Date;
import java.util.List;

public class UserExit extends User {
    List<Orders> orderlist;

    public UserExit() {
    }

    public UserExit(List<Orders> orderlist) {
        this.orderlist = orderlist;
    }

    public UserExit(String username, Date birthday, char sex, String address, List<Orders> orderlist) {
        super(username, birthday, sex, address);
        this.orderlist = orderlist;
    }

    public List<Orders> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(List<Orders> orderlist) {
        this.orderlist = orderlist;
    }

    @Override
    public String toString() {
        return "UserExit{" +
                "user_id=" + this.getId() +
                "user_name=" + this.getUsername() +
                "user_birthday=" + this.getBirthday() +
                "user_sex=" + this.getSex() +
                "user_address=" + this.getAddress() +
                "orderlist=" + orderlist +
                '}';
    }
}
