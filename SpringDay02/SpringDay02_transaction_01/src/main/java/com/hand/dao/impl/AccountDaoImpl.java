package com.hand.dao.impl;

import com.hand.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    public void out(String outer, Double money) {
        String sql = "update account t set t.money=t.money-? " +
                "where t.username=?";
        getJdbcTemplate()
                .update(sql, money, outer);
    }


    public void in(String inner, Double money) {
        String sql = "update account t set t.money=t.money+? " +
                "where t.username=?";
        getJdbcTemplate().update(sql, money, inner);
    }
}
