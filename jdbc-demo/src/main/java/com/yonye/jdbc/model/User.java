package com.yonye.jdbc.model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class User implements RowMapper<User> {
    private  String userName;
    private String password;
    private  Long id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                User user =new User();
        user.setPassword(resultSet.getString("password"));
        user.setUserName(resultSet.getString("username"));
        user.setId(resultSet.getLong("id"));

        return user;
    }


}
