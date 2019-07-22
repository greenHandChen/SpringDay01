package com.ceh.spring.c_hikari;

import com.ceh.spring.a_domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
@Component
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql = "update sys_user su set su.`password` = ? where su.id = ?;";
        jdbcTemplate.update(updateSql,user.getPassword(),user.getId());
    }
}
