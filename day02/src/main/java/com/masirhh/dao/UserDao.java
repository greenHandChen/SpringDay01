package com.masirhh.dao;
import com.masirhh.beans.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(UserBean user){
        String sql="update sys_user u set u.username=? ,u.password=? where u.id=?";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());

    }




}
