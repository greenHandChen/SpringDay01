package com.hand.wqw.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDao extends JdbcDaoSupport {


    public int out(String outer,Double money){
        String sql = "update account set money = money-? where username = ?";
        return super.getJdbcTemplate().update(sql,money,outer);
    }

    public int in(String inner ,Double money){
        String sql = "update account set money = money+? where username = ?";
        return super.getJdbcTemplate().update(sql,money,inner);
    }

}
