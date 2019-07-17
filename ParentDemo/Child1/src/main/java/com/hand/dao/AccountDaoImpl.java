package com.hand.dao;

import com.hand.bean.Account;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    /**
     * @Author yun.sun
     * @param outer 转出账户
     * @param money 转出金额
     */
    public void out(String outer, Double money) {
        String updateSql="update account set money=money-? where username=?";
        getJdbcTemplate().update(updateSql,money,outer);
    }
    /**
     * @Author yun.sun
     * @param inner 转入账户
     * @param money 转入金额
     */
    public void in(String inner, Double money) {
        String updateSql="update account set money=money+? where username=?";
        getJdbcTemplate().update(updateSql,money,inner);
    }
}
