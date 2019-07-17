package com.spring.f_select.selectObject;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User2 implements RowMapper<User2> {
    private Integer id;
    private String username;
    private String password;

    public User2 mapRow(ResultSet rs, int rowNum) throws SQLException {
        User2 user2=new User2();
        user2.setId(rs.getInt("id"));
        user2.setUsername(rs.getString("username"));
        user2.setPassword(rs.getString("password"));
        return user2;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
