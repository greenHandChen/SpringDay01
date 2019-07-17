package com.lx.springtest.Dao;

import com.lx.springtest.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao_two extends JdbcDaoSupport {

    public void update(User user){
        String updateSql = "update sys_user set password = ? where username = ?";
        getJdbcTemplate().update(updateSql,user.getPassword(),user.getUsername());
    }

    public Integer selectCount(){
        String selectSql = "select count(*) from sys_user";
        return getJdbcTemplate().queryForObject(selectSql,null,Integer.class);
    }

    public String selectOne(){
        String selectSql = "select username from sys_user where id = ?";
        Object[] objects = {2L};
        return getJdbcTemplate().queryForObject(selectSql,objects,String.class);
    }

    public User getUserById(User user){
        String queryUserSql = "select * from sys_user where id = ?";
        Object[] objects = {user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql,new User(),objects);
    }

    public List<User> getUsers(){
        String querySql = "select * from sys_user";
        return getJdbcTemplate().query(querySql,new User());
    }
}
