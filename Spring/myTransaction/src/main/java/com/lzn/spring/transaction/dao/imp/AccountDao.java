package com.lzn.spring.transaction.dao.imp;

import com.lzn.spring.transaction.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDao extends JdbcDaoSupport implements IAccountDao {
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money = t.money + ? where t.username = ?", money, inner);
    }
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money = t.money - ? where t.username = ?", money, outer);

    }
}
