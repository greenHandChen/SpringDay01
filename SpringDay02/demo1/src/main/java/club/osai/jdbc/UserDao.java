package club.osai.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: UserDao.java
 * Version: 1.0
 * Date: 2019/7/17
 * Description:
 */
@Repository
public class UserDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void update(User user) {
        String updateSql = "update sys_user u  set u.username=?, u.password=? where u.id =?";
        jdbcTemplate.update(updateSql, user.getUsername(), user.getPassword(), user.getId());
    }

    public void delete(User user) {
        String deleteSql = "delete from sys_user u where  u.id=?";
        jdbcTemplate.update(deleteSql, user.getId());
    }
}
