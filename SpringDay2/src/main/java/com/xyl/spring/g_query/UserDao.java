package com.xyl.spring.g_query;

import com.xyl.spring.a_domain.User;
import com.xyl.spring.f_jdbcDaoSupport.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends JdbcDaoSupport {

    public List<User> getUsers(){
        String selectSql="select * from sys_user";
        return getJdbcTemplate().query(selectSql, new RowMapper<User>() {
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        });
    }
}