package com.softeem.springdao;

import com.softeem.spring.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void  update(User user){

        String sql = "update User set  name=?,password=? where id=?";
        jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getId());


    }

    public void delete(int id){
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql,id);
    }
}
