package com.sise.spring.b_api.jdbcDaoSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String updateSql = "update sys_user su set su.username=?,su.password=? where su.id=?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

}
