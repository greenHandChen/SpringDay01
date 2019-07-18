package com.frank.jdbcSupport;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao extends JdbcDaoSupport {
    public void update(User user){
        String updateSql = "update sys_user set username=? , password=? where id=?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());

    }
    public void delete(User user){
        String sql = "delete from sys_user where id=?";
        getJdbcTemplate().update(sql,user.getId());
    }
    public User getUserById(User user){
        String sql = "select * from sys_user where id=?";
        Object[] objects = {user.getId()};
        return getJdbcTemplate().queryForObject(sql,new User(),objects);
    }
    public List<User> getUserList(){
        String sql = "select * from sys_user";
        return getJdbcTemplate().query(sql,new User());
    }
}