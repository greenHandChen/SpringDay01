package com.hand.demo1;

import com.hand.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


//@Repository
public class UserDao {
   @Autowired
    private JdbcTemplate jdbcTemplate;

    public  void update(User user){
        String  updatesql = "update sys_user u set u.username = ?, u.password = ? where u.id=?";
        jdbcTemplate.update(updatesql,user.getUsername(),user.getPassword(),user.getId());
    }


}
