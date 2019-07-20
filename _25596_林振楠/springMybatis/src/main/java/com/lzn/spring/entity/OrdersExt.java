package com.lzn.spring.entity;

import java.util.Date;

public class OrdersExt {
    private String username;
    private String address;
    private String number;
    private String name;
    private float price;
    private Date createtime;
    private float totalAmount;

    private Date createtimeStart;
    private Date createtimeEnd;
    private float priceStart;
    private float priceEnd;

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createtime=" + createtime +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
