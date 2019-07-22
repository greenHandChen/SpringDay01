package com.ceh.demo.domain;

import java.math.BigDecimal;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public class Account {
    private Long id;
    private String username;
    private BigDecimal money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
