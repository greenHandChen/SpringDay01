package com.spring.f_select.selectObject;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends JdbcDaoSupport {

    public User getUserById(Integer id){
        String selectSql="select * from sys_user where id=?";
        return getJdbcTemplate().queryForObject(selectSql, new RowMapper<User>() {
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        },id);
    }

    public User2 getUserById2(Integer id){
        String selectSql="select * from sys_user where id=?";
        return getJdbcTemplate().queryForObject(selectSql,new User2(),id);
    }
}
