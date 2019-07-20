package com.xyh.Entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersExts extends Orders{

    private User user;

    private String name;
    private String price;
    private BigDecimal total_amount;

    private String priceStart;
    private String priceEnd;

    private Date createtimeStart;
    private Date createtimeEnd;

    public String getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(String priceStart) {
        this.priceStart = priceStart;
    }

    public String getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(String priceEnd) {
        this.priceEnd = priceEnd;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }

    @Override
    public String toString() {
        return "OrdersExts{" +
                "price='" + getNumber() + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", total_amount=" + total_amount +
                '}';
    }
}
