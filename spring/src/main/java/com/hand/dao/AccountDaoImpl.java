package com.hand.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by HuangHeng on 2019/7/21
 */
@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    
    /**
     * @Author:  HuangHeng
     * @Description  out:转出账号，money：转账金额
     * @CreateDate:  2019/7/21
     */
    @Override
    public void outmoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql,money,out);
    }
    
    /**
     * @Author:  HuangHeng
     * @Description  in：转入账号，money：转账金额
     * @CreateDate:  2019/7/21
     */
    @Override
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql,money,in);
    }
}
