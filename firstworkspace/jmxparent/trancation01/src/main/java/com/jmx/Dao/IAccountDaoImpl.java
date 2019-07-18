package com.jmx.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
    @Override
    public void out(String outer, Double money) {
     getJdbcTemplate().update("update account set money=money-? where username=?",money,outer);
    }

    @Override
    public void in(String inter, Double money) {
        getJdbcTemplate().update("update account set money=money+? where username=?",money,inter);
    }
}
