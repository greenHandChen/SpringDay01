package com.hand.dao;

import com.hand.pojo.User;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository("userDao")
public class UserDao extends JdbcDaoSupport {
    private HikariDataSource hikariDataSource;

    /**
     * 初始化方法，在创建bean的时候注入dataSource
     */
    @PostConstruct
    public void init() {
        setDataSource(hikariDataSource);
    }

    @Autowired
    public void setHikariDataSource(HikariDataSource hikariDataSource) {
        this.hikariDataSource = hikariDataSource;
    }

    public List<User> findAll() {
        String sql = "SELECT\n" +
                "`user`.id,\n" +
                "`user`.username,\n" +
                "`user`.`password`\n" +
                "FROM\n" +
                "`user`\n";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return getJdbcTemplate() != null ? getJdbcTemplate().query(sql, rowMapper) : null;
    }


    public Integer insert(User user) {
        String sql = "insert into user values(?,?,?)";
        return getJdbcTemplate() != null ? getJdbcTemplate()
                .update(sql, user.getId(), user.getUsername(), user.getPassword()) : null;
    }


    public Integer update(User originUser, User updateUser) {
        String sql = "update user set username=?,password=? where username=? and password=?";

        return getJdbcTemplate() != null ? getJdbcTemplate()
                .update(sql, updateUser.getUsername(), updateUser.getPassword(),
                        originUser.getUsername(), originUser.getPassword()) : null;
    }


    public Integer delete(User user) {
        String sql = "delete from user where username=? and password=?";
        return getJdbcTemplate() != null ? getJdbcTemplate()
                .update(sql, user.getUsername(), user.getPassword()) : null;
    }
}
