package com.hand.dao.impl;

import com.hand.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void in(String account, BigDecimal money) {
        String sql = "update account set money = money + ? where account = ? ";
        jdbcTemplate.update(sql, money, account);
    }

    @Override
    public void out(String account, BigDecimal money) {
        String sql = "update account set money = money - ? where account = ? ";
        jdbcTemplate.update(sql, money, account);
    }
}
