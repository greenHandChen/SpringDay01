package com.hand.trans;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements IAccountDao {

    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money+? where t.username=?",money,outer);
    }

    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money+? where t.username=?",money,inner);
    }
}
