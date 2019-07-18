package com.spring.hikari;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void update(User user){
        String sql="update sys_user u set u.username=?,u.password=? where u.id=?";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());
    }
    public void delete(User user){
        String sql="delete from sys_user where id=?";
        jdbcTemplate.update(sql,user.getId());
    }
}
