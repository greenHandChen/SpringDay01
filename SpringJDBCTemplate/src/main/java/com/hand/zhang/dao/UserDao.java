package com.hand.zhang.dao;

import com.hand.zhang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName:UserDao
 * Author:ZhangChunjia
 * Date:2019/7/17 10:14
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSQL="insert into user1 values (?,?,?)";
        jdbcTemplate.update(updateSQL,user.getId(),user.getUserName(),user.getPassword());
    }

    public void delete(User user){
        String deleteSQL="delete from uer1 where id=?";
        jdbcTemplate.update(deleteSQL,user.getId());
    }

    public User getUserById(User user){
        String querySQL="select * from uer1 where id=?";
        Object[] objects={user.getId()};
        return  jdbcTemplate.queryForObject(querySQL,new User(),objects);
    }
    public List<User> getUsers(){
        String querySQL="select id,name,pwd from user1";
        return jdbcTemplate.query(querySQL,new User());
    }
}
