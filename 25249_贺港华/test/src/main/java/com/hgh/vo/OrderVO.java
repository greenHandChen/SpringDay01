package com.hgh.vo;

import com.hgh.pojo.Orders;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderVO extends Orders {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    private String username;
    private String address;

    //查询
    private Integer orderNumber;
    private String orderName;

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    private Date createtimeStart;
    private Date createtimeStop;
    private Date createtime;


    private Integer priceStart;
    private Integer priceStop;
    private Integer price;


    private Integer sumnum;




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

    public Date getCreatetimeStart() {
        return createtimeStart;
    }

    public void setCreatetimeStart(Date createtimeStart) {
        this.createtimeStart = createtimeStart;
    }

    public Date getCreatetimeStop() {
        return createtimeStop;
    }

    public void setCreatetimeStop(Date createtimeStop) {
        this.createtimeStop = createtimeStop;
    }

    @Override
    public Date getCreatetime() {
        return createtime;
    }

    @Override
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(Integer priceStart) {
        this.priceStart = priceStart;
    }

    public Integer getPriceStop() {
        return priceStop;
    }

    public void setPriceStop(Integer priceStop) {
        this.priceStop = priceStop;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSumnum() {
        return sumnum;
    }

    public void setSumnum(Integer sumNum) {
        this.sumnum = sumnum;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", orderNumber=" + orderNumber +
                ", orderName='" + orderName + '\'' +
                ", createtime=" + simpleDateFormat.format("YYYY-mm-dd") +
                ", price=" + price +
                ", sumNum=" + sumnum +
                '}';
    }
}
