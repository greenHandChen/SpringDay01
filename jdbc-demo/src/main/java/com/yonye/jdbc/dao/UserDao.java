package com.yonye.jdbc.dao;

import com.yonye.jdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends JdbcTemplate{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql="update sys_user u set u.username=?,u.password=?where id=?";
        jdbcTemplate.update(updateSql,user.getUserName(),user.getPassword(),user.getId());
    }

    public void insert(User user){
        String insertSql="insert into sys_user (username,password) values(?,?);";
        jdbcTemplate.update(insertSql,user.getUserName(),user.getPassword());
    }


    public void delete(User user){
        String delSql="delete from customers where id=?";
        jdbcTemplate.update(delSql,user.getId());
    }
}
