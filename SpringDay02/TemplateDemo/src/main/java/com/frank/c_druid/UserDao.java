package com.frank.c_druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void deleteUser(User user){
        String sql = "delete from sys_user where id=?";
        jdbcTemplate.update(sql,user.getId());
    }
}
