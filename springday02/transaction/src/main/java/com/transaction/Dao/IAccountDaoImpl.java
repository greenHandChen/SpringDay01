package com.transaction.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
    public void in(String inner,Double money){
        getJdbcTemplate().update("update account t set t.money=t.money+? where t.username=?",money,inner);
    }
    public void out(String inner,Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money-? where t.username=?", money, inner);
    }
}
