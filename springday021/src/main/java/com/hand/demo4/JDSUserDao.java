package com.hand.demo4;

import com.hand.po.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;


public class JDSUserDao extends JdbcDaoSupport {

    public void update(User user){
        String  updatesql = "update sys_user u set u.username = ?, u.password = ? where u.id=?";
        getJdbcTemplate().update(updatesql,user.getUsername(),user.getPassword(),user.getId());
    }
    public  void delete(User user){
        String delsql = "delete from sys_user where id = ?";
        getJdbcTemplate().update(delsql,user.getId());
    }
    public List<User> getUser() {
        String listUserSql = "select * from sys_user";
        return getJdbcTemplate().query(listUserSql, new User());
    }
}
