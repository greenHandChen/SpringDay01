package com.ceh.java.examine.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by enHui.Chen on 2019/7/9.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersExt extends Orders {

    private User user;// 一对一映射,懒加载

    private String name;// 商品名称

    private Double price;// 商品价格

    private Double totalAmount;// 订单总价

    private Date createtimeStart;// 创建时间起

    private Date createtimeEnd;// 创建时间止

    private Double priceStart;// 商品价格起

    private Double priceEnd;// 商品价格止

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

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatetimeStart() {
        return createtimeStart;
    }

    public void setCreatetimeStart(Date createtimeStart) {
        this.createtimeStart = createtimeStart;
    }

    public Date getCreatetimeEnd() {
        return createtimeEnd;
    }

    public void setCreatetimeEnd(Date createtimeEnd) {
        this.createtimeEnd = createtimeEnd;
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

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "OrdersExt{" +
                "user=" + user +
                ", number='" + super.getNumber() + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createtime='" + sdf.format(super.getCreatetime()) + '\'' +
                ", totalAmount=" + totalAmount +
                "'}'";
    }
}
