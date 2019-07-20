package com.hand.Ext;

import java.util.Date;

//查询条件包含订单编号(number)、商品名称(name)、订单创建时间起(createtimeStart)、订单创建时间止(createtimeEnd)、
//        商品价格起(priceStart)、商品价格止(priceEnd)。查询结果包含用户名(username)、用户地址(address)、订单编号(number)、
//        商品名称(name)、商品价格(price)、订单的创建时间(createtime，日期格式如:2018-01-01)、订单行对应的订单下的订单总价
//        (total_amount，结果保留两位小数)
public class OrdersExt {
    //订单编号
    private String number;
//    商品名称
    private String name;
    //    订单创建时间起
    private Date createtimeStart;
    //    订单创建时间止
    private Date createtimeEnd;
    //    商品价格起
    private Float priceStart;
    //    商品价格止
    private Float priceEnd;
    //商品价格
    private Float price;
    //订单创建时间
    private Date createtime;
    //商品总价
    private Float total_amount;
    @Override
    public String toString() {
        return "OrdersExt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", createtimeStart=" + createtimeStart +
                ", createtimeEnd=" + createtimeEnd +
                ", priceStart=" + priceStart +
                ", priceEnd=" + priceEnd +
                ", price=" + price +
                ", createtime=" + createtime +
                ", total_amount=" + total_amount +
                '}';
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Float total_amount) {
        this.total_amount = total_amount;
    }

    public OrdersExt(String number, String name, Date createtimeStart, Date createtimeEnd, Float priceStart, Float priceEnd, Float price, Date createtime, Float total_amount) {
        this.number = number;
        this.name = name;
        this.createtimeStart = createtimeStart;
        this.createtimeEnd = createtimeEnd;
        this.priceStart = priceStart;
        this.priceEnd = priceEnd;
        this.price = price;
        this.createtime = createtime;
        this.total_amount = total_amount;
    }

    public OrdersExt() {
    }






}
