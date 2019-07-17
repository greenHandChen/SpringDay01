package com.hand.dao.impl;

import com.hand.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void in(String account, BigDecimal money) {
        String sql = "update account set money = money + ? where account = ? ";
        getJdbcTemplate().update(sql, money, account);
    }

    @Override
    public void out(String account, BigDecimal money) {
        String sql = "update account set money = money - ? where account = ? ";
        getJdbcTemplate().update(sql, money, account);
    }
}
