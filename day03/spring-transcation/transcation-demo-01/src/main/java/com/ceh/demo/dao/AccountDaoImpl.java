package com.ceh.demo.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    public void in(String inner, BigDecimal money) {
        super.getJdbcTemplate().update("update `account` a set a.money = a.money + ? where a.username = ?;", money, inner);
    }

    public void out(String outer, BigDecimal money) {
        super.getJdbcTemplate().update("update `account` a set a.money = a.money - ? where a.username = ?;", money, outer);
    }
}
