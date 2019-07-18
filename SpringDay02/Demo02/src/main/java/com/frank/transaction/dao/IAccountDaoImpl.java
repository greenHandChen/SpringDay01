package com.frank.transaction.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
    @Override
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account set money = money + ? where username = ?",money,inner);
    }

    @Override
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account set money = money - ? where username = ?",money,outer);
    }
}
