package com.test.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public  void update(User user){
        String updateSql="Update user u set u.name=?,u.sex=? where id=?";
        jdbcTemplate.update(updateSql,user.getName(),user.getSex(),user.getId());
    }
    public void delete (User user){
        String deleteSql="delete from user u where u.id=?";
        jdbcTemplate.update(deleteSql,user.getId());
    }

}