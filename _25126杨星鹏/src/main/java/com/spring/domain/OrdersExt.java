package com.spring.domain;

import java.util.Date;
import java.util.List;

public class OrdersExt {
    private  String username;
    private String  address;
    private  Integer number;
    private  User user;
    private Date creatimeStart;
    private Date creatimeEnd;
    private  Float priceStart;
    private  Float priceEnd;

    public Date getCreatimeStart() {
        return creatimeStart;
    }

    public void setCreatimeStart(Date creatimeStart) {
        this.creatimeStart = creatimeStart;
    }

    public Date getCreatimeEnd() {
        return creatimeEnd;
    }

    public void setCreatimeEnd(Date creatimeEnd) {
        this.creatimeEnd = creatimeEnd;
    }

    public Float getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(Float priceStart) {
        this.priceStart = priceStart;
    }

    public Float getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(Float priceEnd) {
        this.priceEnd = priceEnd;
    }

    private List<OrderDetail> orderDetails;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
