package com.sise.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    /**
     * 转入
     * @param inner
     * @param money
     */
    public void in(String inner, Double money) {
        String sql = "update account set money = money + ? where name = ?";
         getJdbcTemplate().update(sql,money,inner);
    }

    /**
     * 转出
     * @param outer
     * @param money
     */
    public void out(String outer, Double money) {
        String sql = "update account  set money = money - ? where name = ?";
        getJdbcTemplate().update(sql,money,outer);
    }
}
