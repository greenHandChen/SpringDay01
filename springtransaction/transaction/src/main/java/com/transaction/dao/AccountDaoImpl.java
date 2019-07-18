package com.transaction.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
    /**
     * 转出
     * @param outer
     * @param money
     */
    public void out(String outer, Double money) {
        String sql = "update account set money = money-? where username = ?";
        getJdbcTemplate().update(sql,outer,money);
    }

    /**
     * 转入
     * @param inner
     * @param money
     */
    public void in(String inner, Double money) {
        String sql = "update account set money = money+? where username = ?";
        getJdbcTemplate().update(sql,inner,money);
    }
}
