package org.hgh.demo.dao.impl;

import org.hgh.demo.dao.IAccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    public void in(String inner, BigDecimal money){
        String sql = "update acount set money = money + ? where username = ?";
        getJdbcTemplate().update(sql,money.intValue(),inner);
    }

    public void out(String outer,BigDecimal money){
        String sql = "update acount set money = money - ? where username = ?";
        getJdbcTemplate().update(sql,money.intValue(),outer);
    }
}
