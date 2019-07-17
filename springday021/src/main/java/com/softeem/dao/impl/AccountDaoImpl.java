package com.softeem.dao.impl;

import com.softeem.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    @Override
    public void outMoney(String out, int money) {
        String sql = "update account money=money-?,where username=?";
        this.getJdbcTemplate().update(sql,money,out);
    }

    @Override
    public void inMoney(String in, int money) {
      String sql = "update account set money=money+? where username=?";
      this.getJdbcTemplate().update(sql,money,in);
    }
}
