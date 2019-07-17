package com.hand.bean;

public class Account {
    private Double money;

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }

    public String getUsername() {
        return username;
    }

    private String username;
}
