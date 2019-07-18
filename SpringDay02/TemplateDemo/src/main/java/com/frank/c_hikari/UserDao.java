package com.frank.c_hikari;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void updateUser(User user){
        String sql = "update sys_user set username=?,password=? where id=?";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());
    }
    public void insertUser(User user){
        String sql = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword());
    }
}
