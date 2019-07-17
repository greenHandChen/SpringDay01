package com.sise.spring.b_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql = "update sys_user su set su.username=?,su.password=? where su.id=?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String deleteSql = "delete from sys_user where id=?";
        jdbcTemplate.update(deleteSql,user.getId());

    }
}
