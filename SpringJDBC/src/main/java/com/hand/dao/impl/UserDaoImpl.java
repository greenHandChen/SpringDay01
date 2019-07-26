package com.hand.dao.impl;

import com.hand.bean.User;
import com.hand.dao.IUSerDao;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl extends JdbcDaoSupport implements IUSerDao {
    public int insertUser(User user) {
        String sql ="insert into sys_user(username,password) values(?,?)";
        return this.getJdbcTemplate().update(sql,user.getName(),user.getAge());
    }

    public int deleteUser(Integer id) {
        String sql = "delete from sys_user where id=?";
        return this.getJdbcTemplate().update(sql,id);
    }

    public List<User> selectAllUser() {
        String sql = "select * from sys_user";

        return this.getJdbcTemplate().query(sql, new User());
    }

    public User selectUserById(Integer id) {
        String sql = "select * from sys_user where id=?";
        return this.getJdbcTemplate().queryForObject(sql, new User(),id);
    }

}