package com.hand.DAO.impl;

import com.hand.DAO.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money= t.money+? where t.username=?",money,inner);
    }

    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money= t.money-? where t.username=?",money,outer);
    }
}
