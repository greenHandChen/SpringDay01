package com.zt.f_jdbcDaoSupport;

import com.zt.a_domin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends JdbcDaoSupport {

    public void update(User user) {
        String updateSql = "update sys_user u set u.username = ?, password = ? where id = ?;";
        super.getJdbcTemplate().update(updateSql, user.getUsername(), user.getPassword(), user.getId());
    }
}
