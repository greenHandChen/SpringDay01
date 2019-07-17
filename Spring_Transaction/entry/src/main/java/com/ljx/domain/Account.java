package com.ljx.domain;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 18:04
 */
public class Account {
    private int id;
    private String username;
    private Double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
