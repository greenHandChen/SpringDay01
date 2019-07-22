package com.ceh.spring.f_jdbcDaoSupport;

import com.ceh.spring.a_domain.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String updateSql = "update sys_user su set su.`password` = ? where su.id = ?;";
        super.getJdbcTemplate().update(updateSql,user.getPassword(),user.getId());
    }
}
