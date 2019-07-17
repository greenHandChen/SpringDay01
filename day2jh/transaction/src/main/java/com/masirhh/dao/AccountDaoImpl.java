package com.masirhh.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public void in(String inner, BigDecimal money) {

        super.getJdbcTemplate().update("update account t set t.money=t.money + ? where t.username=?", money, inner);
    }

    public void out(String outer, BigDecimal money) {

        super.getJdbcTemplate().update("update account t set t.money=t.money - ? where t.username=?", money, outer);
    }
}
