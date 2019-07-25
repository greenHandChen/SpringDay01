package com.hand.entity.exts;

import com.hand.entity.Items;
import com.hand.entity.OrderDetail;
import com.hand.entity.Orders;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class OrderExts extends Orders {
    private String username;
    private String address;
    private OrderDetail detail;
    private Items items;
    private Double totalamount;

    public OrderExts() {
    }

    public OrderExts(Integer user_id, String number, Date createtime, String note, String username, String address, OrderDetail detail, Items items, Double totalamount) {
        super(user_id, number, createtime, note);
        this.username = username;
        this.address = address;
        this.detail = detail;
        this.items = items;
        this.totalamount = totalamount;
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

    public Double getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Double totalamount) {
        this.totalamount = totalamount;
    }

    public OrderDetail getDetail() {
        return detail;
    }

    public void setDetail(OrderDetail detail) {
        this.detail = detail;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderExts{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", number=" + detail.getItems_num() +
                ", item_name=" + items.getName() +
                ", item_price=" + items.getPrice() +
                ", createtime='" + new SimpleDateFormat("yyyy-MM-dd").format(getCreatetime()) + '\'' +
                ", totalamount=" + totalamount +
                '}';
    }
}
