package com.hjf.pojo;

import java.util.Date;

/**
 * ClassName:OrdersExt
 * Author:Hejunfeng
 * Date:2019/7/20 15:18
 */
public class OrdersExt {
    private Integer username;
    private Integer address;
    private Integer mumber;
    private String name;
    private Integer price;
    private Date createtime;
    private Integer totalAmount;

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Integer getMumber() {
        return mumber;
    }

    public void setMumber(Integer mumber) {
        this.mumber = mumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username=" + username +
                ", address=" + address +
                ", mumber=" + mumber +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createtime=" + createtime +
                ", totalAmount=" + totalAmount +
                '}';
    }
}