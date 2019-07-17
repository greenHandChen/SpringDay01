package com.hand.TestJDBC;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao1 extends JdbcDaoSupport {
    public void update(User user){
        String updateSql="update sys_user u set u.username=?,u.password=? where u.id=?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }
    public User getUserById(User user){
        String queryUserSql="select * from sys_user where id=?";
        Object[] objects={user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql,new User(),objects);
    }
    public List<User> getUsers(User user){
        String queryUserSql="select * from sys_user where id between 1 and 4";
        return getJdbcTemplate().query(queryUserSql,new User());
    }
}
