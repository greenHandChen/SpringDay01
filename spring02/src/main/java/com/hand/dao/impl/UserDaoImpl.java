package com.hand.dao.impl;

import com.hand.bean.SysUser;
import com.hand.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updatePasswordByUsername(String username,String newPSW) {
        String sql = "update sys_user set password = ? where username = ?";
        jdbcTemplate.update(sql,username,newPSW);
    }



}
