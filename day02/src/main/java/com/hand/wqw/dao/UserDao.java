package com.hand.wqw.dao;

import com.hand.wqw.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int update(User user){
        String sql = "insert into sys_user(id,username,password) values(?,?,?)";
        return jdbcTemplate.update(sql, user.getId(), user.getUsername(), user.getPassword());
    }

}
