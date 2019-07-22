package com.ceh.spring.g_query;

import com.ceh.spring.a_domain.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public class UserDao extends JdbcDaoSupport {

    /**
     * @Author: enHui.Chen
     * @Description: 更新
     * @Data 2019/7/17
     */
    public void update(User user) {
        String updateSql = "update sys_user su set su.`password` = ? where su.id = ?;";
        super.getJdbcTemplate().update(updateSql, user.getPassword(), user.getId());
    }

    /**
     * @Author: enHui.Chen
     * @Description: 简单查询-01
     * @Data 2019/7/17
     */
    public int querySimple01() {
        String querySql = "SELECT count(*) FROM `sys_user`;";
        return super.getJdbcTemplate().queryForObject(querySql, null, Integer.class);
    }

    /**
     * @Author: enHui.Chen
     * @Description: 简单查询-02
     * @Data 2019/7/17
     */
    public String querySimple02(User user) {
        String querySql = "select username from sys_user u where u.id = ?;";
        Object[] objects = {user.getId()};
        return super.getJdbcTemplate().queryForObject(querySql, objects, String.class);
    }

    /**
     * @Author: enHui.Chen
     * @Description: 查询单个对象
     * @Data 2019/7/17
     */
    public User findUserById(User user) {
        String querySql = "select * from sys_user u where u.id = ?;";
        Object[] objects = {user.getId()};
        return super.getJdbcTemplate().queryForObject(querySql, (rs, i) -> {
            User rsUser = new User();
            rsUser.setId(rs.getLong("id"));
            rsUser.setUsername(rs.getString("username"));
            rsUser.setPassword(rs.getString("password"));
            return rsUser;
        }, objects);
    }

    /**
     * @Author: enHui.Chen
     * @Description: 查询集合对象
     * @Data 2019/7/17
     */
    public List<User> findUser() {
        String querySql = "select * from sys_user u;";
        return super.getJdbcTemplate().query(querySql, (rs, i) -> {
            User rsUser = new User();
            rsUser.setId(rs.getLong("id"));
            rsUser.setUsername(rs.getString("username"));
            rsUser.setPassword(rs.getString("password"));
            return rsUser;
        });
    }
}
