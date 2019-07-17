package com.hand.sysmanager.spring.bean;

import java.math.BigDecimal;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 14:53
 */
public class Account {
    private String username;
    private BigDecimal money;

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
