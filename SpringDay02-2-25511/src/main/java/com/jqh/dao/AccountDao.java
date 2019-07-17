package com.jqh.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Auther: 几米
 * @Date: 2019/7/17 10:35
 * @Description: AccountDao
 */
@Repository
public class AccountDao extends JdbcDaoSupport {
    @Resource(name = "dataSource")
    public void setMyDataSource(DataSource dataSource) {
        // 赋值给父类
        super.setDataSource(dataSource);
    }
    public void in(String inner,Double money){
   getJdbcTemplate().update("update `account` set money=money+? where `username` = ?",money,inner);
    }
    public void out(String outer,Double money){
        getJdbcTemplate().update("update `account` set money=money-? where `username` = ?",money,outer);
    }
}
