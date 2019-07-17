package com.ct.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account set money = money - ? where username = ?", money, outer);
    }

    @Override
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account set money = money + ? where username = ?", money, inner);
    }
}
