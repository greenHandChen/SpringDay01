package com.hph.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user) {
        String updateSql = "update sys_user u set u.username = ? , u.password = ? where id = ?";
        jdbcTemplate.update(updateSql, user.getUsername(), user.getPassword(), user.getId());
    }

    public void delete(User user) {
        String deleteSql = "delete from sys_user where id = ?";
        jdbcTemplate.update(deleteSql, user.getId());
    }

    public void insert(User user) {
        String insertSql = "insert into sys_user values(null,?,?)";
        jdbcTemplate.update(insertSql,user.getUsername(),user.getPassword());
    }

    public User getUserById(User user){
        String queryUserSql = "select * from sys_user where id = ?";
        Object[] objects = {user.getId()};
        return jdbcTemplate.queryForObject(queryUserSql, new User(), objects);
    }

    public List<User> getUsers(){
        String querySql = "select * from sys_user";
        return jdbcTemplate.query(querySql, new User());
    }



}
