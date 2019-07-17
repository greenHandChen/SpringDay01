package com.lx.springtest.Dao.Impl;

import com.lx.springtest.Dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    public void out(String outer, Double money) {
        String updateSql = "update account set money = money - ? where username = ?";
        getJdbcTemplate().update(updateSql,money,outer);
    }

    public void in(String inner, Double money) {
        String updateSql = "update account set money = money + ? where username = ?";
        getJdbcTemplate().update(updateSql,money,inner);
    }
}
