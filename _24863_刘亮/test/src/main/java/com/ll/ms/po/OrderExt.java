package com.ll.ms.po;

import java.util.Date;
import java.util.List;

public class OrderExt extends Order{

    private String username;

    private String address;

    private User user;

    private List<OrderDetail> detailList;

    private List<Item> itemList;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<OrderDetail> detailList) {
        this.detailList = detailList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public OrderExt(int id, int user_id, String number, Date datetime, String note, String username, String address, User user, List<OrderDetail> detailList, List<Item> itemList) {
        super(id, user_id, number, datetime, note);
        this.username = username;
        this.address = address;
        this.user = user;
        this.detailList = detailList;
        this.itemList = itemList;
    }

    public OrderExt(String username, String address, User user, List<OrderDetail> detailList, List<Item> itemList) {
        this.username = username;
        this.address = address;
        this.user = user;
        this.detailList = detailList;
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "OrderExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", detailList=" + detailList +
                ", itemList=" + itemList +
                '}';
    }
}
