package com.spring.druid;

import com.spring.hikari.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao2 extends JdbcDaoSupport {
    public void update(User user){
        String sql="update sys_user u set u.username=?,u.password=? where u.id=?";
        getJdbcTemplate().update(sql,user.getUsername(),user.getPassword(),user.getId());
    }
    public void delete(User user){
        String sql="delete from sys_user where id=?";
        getJdbcTemplate().update(sql,user.getId());
    }
    public com.spring.druid.User getUserById(com.spring.druid.User user){
        String sql="select * from sys_user where id=?";
        Object[] objects={user.getId()};
        return getJdbcTemplate().queryForObject(sql,new com.spring.druid.User(),objects);
    }
    public List<com.spring.druid.User> getUsers(){
        String sql="select * from sys_user";
        return getJdbcTemplate().query(sql,new com.spring.druid.User());
    }
}
