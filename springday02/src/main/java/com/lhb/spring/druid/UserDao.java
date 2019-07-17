package com.lhb.spring.druid;

import com.lhb.spring.a_domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created By LHB on 2019/7/17;
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql="update sys_user u set u.username = ?,u.password = ? where id=?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }
    public void delete(User user){
        String updateSql="delete from sys_user where id = ?";
        jdbcTemplate.update(updateSql,user.getId());
    }
}
