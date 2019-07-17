package com.hand.Repository;

import com.hand.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserRepositoryIm implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 创建用户
    @Override
    public void createUser(User user) {

        // sql
        String sql = "INSERT INTO `sys_user`(username, password) VALUE ( ?, ?)";

        jdbcTemplate.update(sql, user.getUsername(), user.getPassword());

    }

    // 删除用户
    @Override
    public void removeUser(User user) {

        // sql
        String sql = "DELETE FROM `sys_user` WHERE `id` = ?";

        jdbcTemplate.update(sql, user.getId());

    }
}
