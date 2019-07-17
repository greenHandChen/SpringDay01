package com.hand.dao;

import com.hand.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDao extends JdbcDaoSupport  {

    public List<User> findAll() {
        String sql = "SELECT\n" +
                "`user`.id,\n" +
                "`user`.username,\n" +
                "`user`.`password`\n" +
                "FROM\n" +
                "`user`\n";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return getJdbcTemplate().query(sql, rowMapper);
    }


    public int insert(User user) {
        String sql = "insert into user values(?,?,?)";
        return getJdbcTemplate().update(sql, user.getId(), user.getUsername(), user.getPassword());
    }


    public int update(User originUser, User updateUser) {
        String sql = "update user set username=?,password=? where username=? and password=?";

        return getJdbcTemplate()
                .update(sql, updateUser.getUsername(), updateUser.getPassword(), originUser.getUsername(), originUser.getPassword());
    }


    public int delete(User user) {
        String sql = "delete from user where username=? and password=?";
        return getJdbcTemplate()
                .update(sql, user.getUsername(), user.getPassword());
    }
}
