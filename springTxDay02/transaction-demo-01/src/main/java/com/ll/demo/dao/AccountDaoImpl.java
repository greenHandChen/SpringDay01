package com.ll.demo.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    public void in(String inner, int money) {
        super.getJdbcTemplate().update("update account t set t.money = (t.money + ?) where t.username = ?;",money,inner);
    }

    public void out(String outer, int money) {
        super.getJdbcTemplate().update("update account t set t.money = (t.money - ?) where t.username = ?;",money,outer);
    }
}









