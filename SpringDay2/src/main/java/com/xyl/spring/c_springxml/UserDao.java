package com.xyl.spring.c_springxml;

import com.xyl.spring.a_domain.User;
import org.apache.maven.plugins.annotations.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public void upadte(User user){
        String updateSql="update sys_user su set su.password=? where su.id=?:;" ;
        jdbcTemplate.update(updateSql,user.getPassword(),user.getId());

    }

    public void delete(){
        String delteSql="";
        jdbcTemplate.delete();
    }
}
