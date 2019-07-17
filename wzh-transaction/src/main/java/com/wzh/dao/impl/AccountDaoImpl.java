package com.wzh.dao.impl;

import com.wzh.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    public void out(String outer, Double money) {
        String sql = "update account set money = money- ? where username = ?";
        getJdbcTemplate().update(sql, money,outer);
    }

    public void in(String inner, Double money) {
        String sql = "update account set money=money+? where username = ?";
        getJdbcTemplate().update(sql,  money,inner);
    }
}
