package com.hand.dao.impl;

import com.hand.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    public int inAccount(String username, double amount) {
        String sql = "update account set money=money+? where username=?";
        int flag = this.getJdbcTemplate().update(sql, amount, username);
        checkResult(username, amount, flag, false);
        return flag;
    }

    public int outAccount(String username, double amount) {
        String sql = "update account set money=money-? where username=?";
        int flag = this.getJdbcTemplate().update(sql, amount, username);
        checkResult(username, amount, flag, true);
        return flag;
    }

    private void checkResult(String username, double amount, int flag, boolean t) {
        if (flag > 0) {
            if (t) {
                System.out.println("账户" + username + "转出" + amount);
            } else {
                System.out.println("账户" + username + "转入" + amount);
            }
        } else {
            System.out.println("账户" + username + "转出失败！");
        }
        System.out.println("--------------------------------------");
    }
}
