package com.wzh.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.wzh.beans.User;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class UserDao {
    @Autowired
    JdbcTemplate jdbctemplate;

    public void update(User user){
        String sql = "update sys_user set username=?,password = ? where id =?";
        jdbctemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());
    }




}
