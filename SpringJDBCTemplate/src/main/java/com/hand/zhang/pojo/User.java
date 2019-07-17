package com.hand.zhang.pojo;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName:User
 * Author:ZhangChunjia
 * Date:2019/7/17 10:18
 */
@Component("user")
public class User implements RowMapper<User> {
    private Integer id;
    private String userName;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "id:"+id+"---用户名:"+userName+"---密码:"+password;
    }

    //
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user=new User();
        user.setId(resultSet.getInt("id"));
        user.setUserName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("pwd"));

        return user;
    }
}
