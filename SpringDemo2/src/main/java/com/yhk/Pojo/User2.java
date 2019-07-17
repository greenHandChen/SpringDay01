package com.yhk.Pojo;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class User2 implements RowMapper {
    private Long id;
    private String username;
    private String password;

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User2 user2=new User2();
        user2.setId(resultSet.getLong("id"));
        user2.setUsername(resultSet.getString("username"));
        user2.setPassword(resultSet.getString("password"));
        return  user2;
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

    public User2(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User2() {
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
