package com.st.hikari.dao;

import com.st.hikari.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends JdbcDaoSupport {
    public User queryOne(int id) {
        String sql = "select * from sys_user where id=?";
        return this.getJdbcTemplate().queryForObject(sql,new User(),id);
    }

    public List<User> queryAll() {
        String sql = "select * from sys_user";
        return getJdbcTemplate().query(sql,new User());
    }

    public int insertUser(User user) {
        String sql = "insert into sys_user(username,password) values(?,?)";
        return this.getJdbcTemplate().update(sql,user.getUsername(),user.getPassword());
    }

    public int deleteUser(int id) {
        String sql = "delete from sys_user where id=?";
        return this.getJdbcTemplate().update(sql,id);
    }
}
