package com.lzn.spring.jdbcDaoSupport;

import com.lzn.spring.jdbc.SysUser;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UserDaoSup extends JdbcDaoSupport {

    public void update(SysUser user) {
        String updateSql = "update sys_user u set u.username = ?, u.password = ? where u.id = ?";
        getJdbcTemplate().update(updateSql, user.getUsername(), user.getPassword(), user.getId());

    }

    public void delete(SysUser user) {
        String deleteSql = "delete from sys_user where id = ?";
        getJdbcTemplate().update(deleteSql, user.getId());
    }

    public  SysUser getUserById(SysUser user) {
        String queryUserSql = "select * from sys_user u where u.id = ?";
        Object[] objects = {user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql, new SysUser(), objects);
    }

    public List<SysUser> getUsers() {
        String queryUserSql = "select * from sys_user";
        return getJdbcTemplate().query(queryUserSql, new SysUser());
    }
}
