package com.java.web.spring.e_jdbcSupport;

import com.java.web.spring.a_entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends JdbcDaoSupport {


    public void update(User user){
        String sql = "update sys_user su set su.username = ?, su.password = ? where su.id = ?;";
        getJdbcTemplate().update(sql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(Long id){
        String sql = "delete from sys_user where id = ?";
        getJdbcTemplate().update(sql,id);
    }


}
