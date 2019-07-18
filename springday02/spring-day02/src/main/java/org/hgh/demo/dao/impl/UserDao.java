package org.hgh.demo.dao.impl;

import org.hgh.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql = "update sys_user u set u.username = ?,u.password = ? where u.id = ?;";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(Integer id){
        String deleteSql = "delete from sys_user where id = ?";
        jdbcTemplate.update(deleteSql,id);
    }



}