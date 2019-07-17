package com.java.web.spring.f_query;

import com.java.web.spring.a_entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String sql = "update sys_user su set su.username = ?, su.password = ? where su.id = ?;";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(Long id){
        String sql = "delete from sys_user where id = ?";
        jdbcTemplate.update(sql,id);
    }

    public Integer querySimple01(){
        String querySql = "select count(*) from sys_user;";
        Integer integer = jdbcTemplate.queryForObject(querySql, null, Integer.class);
        return integer;
    }

    public User findUserById(User user){
        String querySql = "select * from sys_user where id = ?";
        Object[] objects = {user.getId()};
        return (User) jdbcTemplate.queryForObject(querySql,new User(), objects);
    }

    public List<User> getUsers(){
        String queryUserSql = "select * from sys_user";
        return jdbcTemplate.query(queryUserSql,new User());
    }


}
