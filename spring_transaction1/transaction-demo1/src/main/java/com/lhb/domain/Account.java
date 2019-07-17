package com.lhb.domain;

/**
 * Created By LHB on 2019/7/17;
 */
public class Account {
    public Integer id;
    public String username;
    public Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
