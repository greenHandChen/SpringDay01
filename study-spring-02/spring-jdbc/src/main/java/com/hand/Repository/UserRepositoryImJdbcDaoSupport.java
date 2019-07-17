package com.hand.Repository;

import com.hand.Entity.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserRepositoryImJdbcDaoSupport extends JdbcDaoSupport {

    // 创建用户
    public void createUser(User user) {

        // sql
        String sql = "INSERT INTO `sys_user`(username, password) VALUE ( ?, ?)";

        getJdbcTemplate().update(sql, user.getUsername(), user.getPassword());

    }

    // 删除用户
    public void removeUser(User user) {

        // sql
        String sql = "DELETE FROM `sys_user` WHERE `id` = ?";

        getJdbcTemplate().update(sql, user.getId());

    }
}
