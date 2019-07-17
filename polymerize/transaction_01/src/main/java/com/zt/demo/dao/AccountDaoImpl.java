package com.zt.demo.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    public void in(String inner, BigDecimal money) {
        String inSql = "update account a set a.money = a.money + ? where a.username = ?";
        super.getJdbcTemplate().update(inSql, money, inner);
    }

    public void out(String out, BigDecimal money) {
        String outSql = "update account a set a.money = a.money - ? where a.username = ?";
        super.getJdbcTemplate().update(outSql, money, out);
    }
}
