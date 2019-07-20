package com.hand.vo;

import java.math.BigDecimal;

public class OrdersItemVo {

    private String name;
    private BigDecimal price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrdersItemVo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
