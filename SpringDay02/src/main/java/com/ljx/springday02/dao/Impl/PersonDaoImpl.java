package com.ljx.springday02.dao.Impl;

import com.ljx.springday02.dao.UserDao;
import com.ljx.springday02.entry.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 16:53
 */
public class PersonDaoImpl extends JdbcDaoSupport implements UserDao {

    @Override
    public void update(User user) {
        String sql = "update user set username= ? where id = ?";
        getJdbcTemplate().update(sql, user.getUsername(), user.getId());
    }

    @Override
    public User getUser(User user) {
        String sql = "select * from user where id = ?";
        Object[] objects = {user.getId()};
        return (User) getJdbcTemplate().queryForObject(sql,new User(), objects);
    }

    @Override
    public List<User> findUser() {
        String sql = "select * from user";
        return getJdbcTemplate().query(sql,new User());
    }
}
