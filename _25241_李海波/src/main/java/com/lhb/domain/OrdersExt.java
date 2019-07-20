package com.lhb.domain;

import java.util.Date;

/**
 * Created By LHB on 2019/7/20;
 */
public class OrdersExt {
    private Integer number;
    private String name;
    private Date createtimeStart;
    private Date createtimeEnd;
    private Float price;
    private Float priceEnd;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(Float priceEnd) {
        this.priceEnd = priceEnd;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", createtimeStart=" + createtimeStart +
                ", createtimeEnd=" + createtimeEnd +
                ", price=" + price +
                ", priceEnd=" + priceEnd +
                '}';
    }
}
