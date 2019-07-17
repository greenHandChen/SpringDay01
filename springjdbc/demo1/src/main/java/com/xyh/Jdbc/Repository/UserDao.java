package com.xyh.Jdbc.Repository;

import com.xyh.Jdbc.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(User user){
        String sql="insert into sys_user(username,`password`) values(?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword());
    }

    public void update(User user){
        String sql="update sys_user set username=?,`password`=? where id=?";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String sql="delete from sys_user where id=?";
        jdbcTemplate.update(sql,user.getId());
    }

}
