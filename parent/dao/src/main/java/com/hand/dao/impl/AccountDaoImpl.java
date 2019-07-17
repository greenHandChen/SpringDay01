package com.hand.dao.impl;

import com.hand.dao.AccountDao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public  void in(String inner,Integer money){
        getJdbcTemplate().update("update account set money =money+? where username=?",money,inner);
    }
    public  void out(String outer,Integer money){
        getJdbcTemplate().update("update account set money =money-? where username=?",money,outer);
    }
}
