package com.yts.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    public void in(String inner, Double money) {
        String sql = "update account set money = money + ? where username = ?";
getJdbcTemplate().update(sql,money,inner);
    }

    public void out(String outer, Double money) {
        String sql = "update account set money = money - ? where username = ?";
        getJdbcTemplate().update(sql,money,outer);
    }
}
