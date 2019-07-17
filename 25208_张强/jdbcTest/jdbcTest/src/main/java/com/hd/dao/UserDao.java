package com.hd.dao;

import com.hd.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zq on 2019/7/17
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void getUser(){
        String sql ="select * from sys_user";
        List<SysUser> list = jdbcTemplate.query(sql, new UserRowMapper());
        for (SysUser user:list ) {
            System.out.println(user.getId()+":"+user.getPassword()+":"+user.getUsername());
        }
    }

    public void update(SysUser user) {
        String updateSql = "select sys_user u set u.username=?,u.password=? where id=?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }
}
