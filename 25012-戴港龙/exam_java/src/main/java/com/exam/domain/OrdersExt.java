package com.exam.domain;

import java.util.Date;
import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 9:01 2019/7/19
 * @Modified By:
 */
public class OrdersExt extends Orders {
    //订单编号
    private String number;
    //商品名称
    private String name;
    //订单创建时间起
    private Date createtimeStart;
    //订单创建时间止
    private Date createtimeEnd;
    //商品价格起
    private Double priceStart;
    //商品价格止
    private Double priceEnd;

    private User user;
    private List<Items> itemsList;

    @Override
    public String getNumber() {
        return number;
    }

    @Override
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }
}
