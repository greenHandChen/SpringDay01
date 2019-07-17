package com.lhb.spring.jdbcDaoSupport;

import com.lhb.spring.a_domain.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created By LHB on 2019/7/17;
 */
@Repository
public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String updateSql="update sys_user us set us.username = ? ,us.password = ? where id = ?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());

    }

    public void delete(User user){
        String deleteSql="delete from sys_user where id= ?";
        getJdbcTemplate().update(deleteSql,user.getId());
    }
}
