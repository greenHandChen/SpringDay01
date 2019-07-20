package com.zt.exam.domain;

import java.util.Date;

/**
 * @description:
 * 订单编号(number)、
 * 商品名称(name)、
 * 订单创建时间起(createtimeStart)、
 * 订单创建时间止(createtimeEnd)、
 * 商品价格起(priceStart)、
 * 商品价格止(priceEnd)。
 *
 * 用户名(username)、
 * 用户地址(address)、
 * 订单编号(number)、
 * 商品名称(name)、
 * 商品价格(price)、
 * 订单的创建时间(createtime，日期格式如:2018-01-01)、
 * 订单行对应的订单下的订单总价(total_amount，结果保留两位小数)
 * @author: invokerZt
 * @date: 2019-07-20 15:07
 */
public class OrdersExt extends Orders {

    // 查询条件
    private String name;

    private Date createtimeStart;

    private Date createtimeEnd;

    private Float priceStart;

    private Float priceEnd;


    // 查询结果
    private String username;

    private String address;

    private Float price;

    private Float total_amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Float total_amount) {
        this.total_amount = total_amount;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", number='" + super.getNumber() + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createtime='" + super.getCreatetime() + '\'' +
                ", total_amount=" + total_amount +
                '}';
    }
}
