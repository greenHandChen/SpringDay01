package com.yhk.Spring.f_jdbcSupport;

import com.yhk.Pojo.User;
import com.yhk.Pojo.User2;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String updatesql="update sys_user u set u.username=? ,u.password=? where u.id=?";
        getJdbcTemplate().update(updatesql,user.getUsername(),user.getPassword(),user.getId());
    }

    public User2 GetUserById(User2 user2) {
        String sql = "select * from sys_user u where u.id=?";
        Object[] objects={user2.getId()};
        return (User2)getJdbcTemplate().queryForObject(sql,new User2(),objects);
    }
    public List<User2> getAllUser(){
        String sql ="select * from sys_user";
        return  getJdbcTemplate().query(sql,new User2());
    }
}
