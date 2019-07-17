package com.hand.UserDaoImpl;

import com.hand.UserDao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money-? where t.username=?",money,outer);
    }

    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money+? where t.username=?",money,inner);
    }
}
