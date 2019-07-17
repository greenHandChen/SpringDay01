package com.xyh.Transaction.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.math.BigDecimal;

@Repository
public class AccountDao extends JdbcDaoSupport {

    public AccountDao(@Autowired DataSource dataSource){
        setDataSource(dataSource);
    }

    public void in(String inner, BigDecimal money) {
        String sql="update account set money=money+? where username=?";
        super.getJdbcTemplate().update(sql,money,inner);
    }

    public void out(String outer, BigDecimal money) {
        String sql="update account set money=money-? where username=?";
        super.getJdbcTemplate().update(sql,money,outer);
    }
}
