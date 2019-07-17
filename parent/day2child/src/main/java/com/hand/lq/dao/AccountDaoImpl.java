package com.hand.lq.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money-? where t.username=?",money,outer);
    }

    @Override
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money+? where t.username=?",money,inner);
    }
}
