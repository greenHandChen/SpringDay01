package com.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public void in(String inner, Double money) {
        System.out.println(money);
        System.out.println(inner);
        getJdbcTemplate().update("update account set money=money+? where username=?",money,inner);
        System.out.println("转进");
    }

    public void out(String outer, Double money) {
        System.out.println(money);
        getJdbcTemplate().update("update account set money=money-? where username=?",money,outer);
        System.out.println(outer);
        System.out.println("转出");

    }
}
