package com.zhang.dao.impl;

import com.zhang.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * ClassName:IAccountDaoImpl
 * Author:ZhangChunjia
 * Date:2019/7/17 19:51
 */
@Repository("iAccountDao")
public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao {


    @Override
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money =t.money+? where t.username=?",money,outer);
    }

    @Override
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money = t.money-? where t.username=? where ;",money,inner);

    }
}
