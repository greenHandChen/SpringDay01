package com.java.web.spring.d_springxml_druid;

import com.java.web.spring.a_entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

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


}
