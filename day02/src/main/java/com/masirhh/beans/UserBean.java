package com.masirhh.beans;

import com.masirhh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBean implements RowMapper<UserBean> {

    private Long id;
    private String username;
    private String password;

    public UserBean() {
    }

    ;

    public UserBean(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public UserBean mapRow(ResultSet resultSet, int i) throws SQLException {
        UserBean userDao=new UserBean();
        userDao.setId(resultSet.getLong("id"));
        userDao.setUsername(resultSet.getString("username"));
        userDao.setPassword(resultSet.getString("password"));
        return userDao;
    }


}

