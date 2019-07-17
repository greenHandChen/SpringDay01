package com.hd.dao;

import com.hd.entity.SysUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zq on 2019/7/17
 */
public class UserRowMapper implements RowMapper<SysUser> {


    @Override
    public SysUser mapRow(ResultSet resultSet, int i) throws SQLException {
        SysUser user = new SysUser();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }
}
