package com.hand.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AcountDaoImpl extends JdbcDaoSupport implements AcountDao {
    /**
     *
     * 转入
     */
    public void in(String inner, double money) {
        getJdbcTemplate().update("update account t set t.money = t.money + ? where t.username = ?",money,inner);

    }

    /**
     *
     * 转出
     */
    public void out(String outer, double money) {
        getJdbcTemplate().update("update account t set t.money = t.money - ? where t.username = ?",money,outer);
    }
}
