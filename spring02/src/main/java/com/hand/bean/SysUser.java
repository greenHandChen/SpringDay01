package com.hand.bean;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SysUser implements RowMapper<SysUser> {

    private int id;
    private String username;
    private String password;

    public SysUser() {
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public SysUser mapRow(ResultSet resultSet, int i) throws SQLException {
        SysUser sysUser = new SysUser();
        sysUser.setId(resultSet.getInt("id"));
        sysUser.setUsername(resultSet.getString("username"));
        sysUser.setPassword(resultSet.getString("password"));
        return sysUser;
    }
}
