package com.softeem.spring;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User1 implements RowMapper {

    private int uid;
    private String username;
    private  String password;

    public User1() {
    }

    public User1(int uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public User1 mapRow(ResultSet resultSet, int i) throws SQLException {
        User1 user1 = new User1();
        user1.setUid(resultSet.getInt("uid"));
        user1.setUsername(resultSet.getString("username"));
        user1.setPassword(resultSet.getString("password"));
        return  user1;
    }

    @Override
    public String toString() {
        return "User1{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
