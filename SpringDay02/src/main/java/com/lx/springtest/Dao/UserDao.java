package com.lx.springtest.Dao;

import com.lx.springtest.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public void update(User user){
//        String updateSql = "update sys_user set password = ? where username = ?";
//        jdbcTemplate.update(updateSql,user.getPassword(),user.getUsername());
//    }

    public void update(User user){
        System.out.println(user);
    }
}
