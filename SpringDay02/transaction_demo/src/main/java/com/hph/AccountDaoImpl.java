package com.hph;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account set money = money + ? where username = ?", money, inner );
    }

    @Override
    public void out(String outter, Double money) {
        getJdbcTemplate().update("update account set money = money - ? where username = ?", money, outter );
    }
}
