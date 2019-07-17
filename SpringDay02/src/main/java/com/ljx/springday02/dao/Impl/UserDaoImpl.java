package com.ljx.springday02.dao.Impl;

import com.ljx.springday02.dao.UserDao;
import com.ljx.springday02.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 15:21
 */

public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void update(User user) {
        String sql = "update user set username= ? where id = ?";
        jdbcTemplate.update(sql, user.getUsername(), user.getId());
    }

    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public List<User> findUser() {
        return null;
    }

    //    @Override
//    public void update(User user) {
//        String sql = "update user set username= ? where id = ?";
//        getJdbcTemplate().update(sql, user.getUsername(), user.getId());
//    }
//
//    @Override
//    public User getUser(User user) {
//        String sql = "select * from user where id = ?";
//        Object[] objects = {user.getId()};
//        return (User) getJdbcTemplate().queryForObject(sql,new User(), objects);
//    }
//
//    @Override
//    public List<User> findUser() {
//        String sql = "select * from user";
//        return getJdbcTemplate().query(sql,new User());
//    }
}
