package com.lhb.spring.hakari;

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
        String updateSql="update sys_user us set us.username = ? ,us.password = ? where id = ?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }
}
