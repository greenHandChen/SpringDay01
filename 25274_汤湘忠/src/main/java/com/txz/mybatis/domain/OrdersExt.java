package com.txz.mybatis.domain;

import org.springframework.core.annotation.Order;

import javax.swing.*;
import java.util.Date;
import java.util.List;

public class OrdersExt extends Items{
    private String username;
    private String address;
    private Integer total_amount;
    private Orders orders;
    private String createtimestart;
    private String createtimeend;
    private Float pricestart;
    private Float priceend;

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotal_amount(Integer total_amount) {
        this.total_amount = total_amount;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public String getCreatetimestart() {
        return createtimestart;
    }

    public String getCreatetimeend() {
        return createtimeend;
    }

    public void setCreatetimestart(String createtimestart) {
        this.createtimestart = createtimestart;
    }

    public void setCreatetimeend(String createtimeend) {
        this.createtimeend = createtimeend;
    }

    public Float getPricestart() {
        return pricestart;
    }

    public Float getPriceend() {
        return priceend;
    }

    public void setPricestart(Float pricestart) {
        this.pricestart = pricestart;
    }

    public void setPriceend(Float priceend) {
        this.priceend = priceend;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", total_amount=" + total_amount +
                ", orders=" + orders +
                '}';
    }
}
