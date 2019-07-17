package com.hand.dao;

import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by HuangHeng on 2019/7/17
 */
@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    /**
     * @author:  HuangHeng
     * @description  转入
     * @CreateDate:  2019/7/17
     */
    public void in(String inner, int money) {
        super.getJdbcTemplate().update("update account t set t.money = (t.money + ?) " +
                "where t.username = ?;",money,inner);
    }
    /**
     * @author:  HuangHeng
     * @description  转出
     * @CreateDate:  2019/7/17
     */
    public void out(String outer, int money) {
        super.getJdbcTemplate().update("update account t set t.money = (t.money - ?) " +
                "where t.username = ?;",money,outer);
    }

}
