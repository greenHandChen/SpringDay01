package com.hph.jdbcdemo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SupportDao extends JdbcDaoSupport {

    public void update(User user) {
        String updateSql = "update sys_user u set u.username = ? , u.password = ? where id = ?";
        getJdbcTemplate().update(updateSql, user.getUsername(), user.getPassword(), user.getId());
    }

    public void delete(User user) {
        String deleteSql = "delete from sys_user where id = ?";
        getJdbcTemplate().update(deleteSql, user.getId());
    }

    public void insert(User user) {
        String insertSql = "insert into sys_user values(null,?,?)";
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        getJdbcTemplate().update(insertSql,user.getUsername(),user.getPassword());
    }



}
