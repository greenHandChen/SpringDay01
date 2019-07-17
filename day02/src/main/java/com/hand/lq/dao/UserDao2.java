package com.hand.lq.dao;

import com.hand.lq.pojo.User;
import com.hand.lq.pojo.User2;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;


public class UserDao2 extends JdbcDaoSupport {

    public void update(User user) {
        String sql = "update sys_user u set u.username=?,u.password=? where u.id=?";
        getJdbcTemplate().update(sql, user.getUsername(), user.getPassword(), user.getId());
    }

    public List<User2> getAll() {
        String quert = "select * from sys_user";
        return getJdbcTemplate().query(quert, new User2());
    }

    public User2 getById(User2 user) {
        String quert = "select * from sys_user u where  u.id=?";
        Object[] o = {user.getId()};
        return getJdbcTemplate().queryForObject(quert, new User2(),o);
    }
}
