package com.hand.wqw.bean;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User implements RowMapper<User> {
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User u = new User();
        u.setId(resultSet.getInt("id"));
        u.setUsername(resultSet.getString("username"));
        u.setPassword(resultSet.getString("password"));
        return u;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
