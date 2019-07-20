package com.hand.pojo;

import java.util.Date;

/**
 * @Author: 王俊
 * @Date: 2019/7/20 15:18
 **/
public class OrdersExt {
    private String username;
    private String address;
    private String number;
    private String name;
    private Double price;
    private Date createTime;
    private Double total_amount;
    private Date createTime_start;
    private Date createTime_end;
    private Double priceStart;
    private Double priceEnd;

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", total_amount=" + total_amount +
                ", createTime_start=" + createTime_start +
                ", createTime_end=" + createTime_end +
                ", priceStart=" + priceStart +
                ", priceEnd=" + priceEnd +
                '}';
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public Date getCreateTime_start() {
        return createTime_start;
    }

    public void setCreateTime_start(Date createTime_start) {
        this.createTime_start = createTime_start;
    }

    public Date getCreateTime_end() {
        return createTime_end;
    }

    public void setCreateTime_end(Date createTime_end) {
        this.createTime_end = createTime_end;
    }

    public Double getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(Double priceStart) {
        this.priceStart = priceStart;
    }

    public Double getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(Double priceEnd) {
        this.priceEnd = priceEnd;
    }
}
