package com.spring.trancation.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{


    public void out(String outer, Double money) {
           getJdbcTemplate().update("update account a set a.money=a.money-? where a.username=?",money,outer);
    }


    public void in(String inter, Double money) {
        getJdbcTemplate().update("update account a set a.money=a.money+? where a.username=?",money,inter);

    }
}
