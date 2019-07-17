package com.zd.dto;

import java.math.BigDecimal;

public class Money {

    private Integer id;
    private String username;
    private BigDecimal money;

    public Money() {
    }

    public Money(Integer id, String username, BigDecimal money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
