package com.yts.dao;

import com.yts.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao extends JdbcDaoSupport {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String sql = "update sys_user set username = ? ,password = ? where id = ?";
//        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());
        getJdbcTemplate().update(sql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String sql = "delete from sys_user where id = ?";
//        jdbcTemplate.update(sql,user.getId());
        getJdbcTemplate().update(sql,user.getId());
    }

    public User findUserById(User user){

        String sql = "select *  from sys_user where id = ?";
        return getJdbcTemplate().queryForObject(sql,new User(),new Object[]{user.getId()});
    }

    public List<User> findAllUsers(){
        String sql = "select *  from sys_user";
        return getJdbcTemplate().query(sql,new User());
    }


}
