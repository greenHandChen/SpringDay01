package com.jmx.pojo;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User implements RowMapper<User>{
      private String username;
      private  String password;
      private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user=new User();
        user.setUsername(resultSet.getString("username"));
        user.setId(resultSet.getInt("id"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}
