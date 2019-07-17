package com.ljx.dao.impl;

import com.ljx.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 18:03
 */
public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    /**
     *功能描述   转出
     * @author LJX
     * @date 2019/7/17 18:39
     * @param  * @param outer
     * @param money
     * @return void
     */
    @Override
    public void out(String outer, Double money) {
        String sql = "update account set money=money - ? where username=? ";
        getJdbcTemplate().update( sql, money, outer);
    }

    /**
     *功能描述   转入
     * @author LJX
     * @date 2019/7/17 18:40
     * @param  * @param inner
     * @param money
     * @return void
     */
    @Override
    public void in(String inner, Double money) {
        String sql = "update account set money=money + ? where username=? ";
        getJdbcTemplate().update( sql, money, inner);
    }

//    @Override
//    public void out(Account account) {
//        String sql = "update account set money=money - ? where username=? ";
//        getJdbcTemplate().update( sql, account.getMoney(), account.getUsername());
//    }
//
//    @Override
//    public void in(Account account) {
//        String sql = "update account set money=money + ? where username=? ";
//        getJdbcTemplate().update( sql, account.getMoney(), account.getUsername());
//    }
}
