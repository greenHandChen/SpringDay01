package com.zd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements  IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @Author Deng.zou
     * @param outer 转出
     * @param money
     */
    @Override
    public void out(String outer, Double money) {
        jdbcTemplate.update("update money set money=money-? where username = ?",money,outer);
    }

    /**
     *
     * @param inner 转入
     * @param money
     */
    @Override
    public void in(String inner, Double money) {
        jdbcTemplate.update("update money set money=money+? where username = ?",money,inner);
    }
}
