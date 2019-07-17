package com.yonye.spring.transcation.template.facade;


import com.yonye.spring.transcation.template.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;


public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void out(String outer, Double money) {
        String inSql="update account t set t.money=t.money - ? where t.username=?";
        getJdbcTemplate().update(inSql,money,outer);
    }

    @Override
    public void in(String inner, Double money) {
        String inSql="update account t set t.money=t.money + ? where t.username=?";
        getJdbcTemplate().update(inSql,money,inner);
    }
}
