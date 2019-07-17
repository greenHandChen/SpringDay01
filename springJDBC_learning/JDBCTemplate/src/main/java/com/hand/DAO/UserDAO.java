package com.hand.DAO;

import com.hand.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql = "update sys_user u set u.username=?,u.password=? where id=?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

}
