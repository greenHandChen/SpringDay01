package com.zt.g_query;

import com.zt.a_domin.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao extends JdbcDaoSupport {

    public void update(User user) {
        String updateSql = "update sys_user u set u.username = ?, password = ? where id = ?;";
        super.getJdbcTemplate().update(updateSql, user.getUsername(), user.getPassword(), user.getId());
    }

    public void query01() {
        String countSql = "select count(*) from sys_user;";
        Integer counts = super.getJdbcTemplate().queryForObject(countSql, null, Integer.class);
        System.out.println(counts);
    }

    public void query02() {
        String querySql02 = "select username from sys_user u where u.id = ?";
        Object[] objects = {2L};
        String rst = super.getJdbcTemplate().queryForObject(querySql02, objects, String.class);
        System.out.println(rst);
    }

    public User query03(User user) {
        String querySql03 = "select * from sys_user u where u.id = ?";
        Object[] objects = {user.getId()};
        return super.getJdbcTemplate().queryForObject(querySql03, (rs, i) -> {
            User user1 = new User();
            user1.setId(rs.getLong("id"));
            user1.setUsername(rs.getString("username"));
            user1.setPassword(rs.getString("password"));
            return user1;
        }, objects);
    }

    public List<User> query04() {
        String querySql04 = "select * from sys_user;";
        return super.getJdbcTemplate().query(querySql04, (rs, i) -> {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            return user;
        });
    }
}
