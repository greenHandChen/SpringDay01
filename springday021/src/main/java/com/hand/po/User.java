package com.hand.po;


import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User implements RowMapper {
    private  int id;
    private  String username;
    private  String password;

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
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
       User user =new User();
       user.setId(resultSet.getInt("id"));
       user.setUsername(resultSet.getString("username"));
       user.setPassword(resultSet.getString("password"));
       return user;
    }
}
