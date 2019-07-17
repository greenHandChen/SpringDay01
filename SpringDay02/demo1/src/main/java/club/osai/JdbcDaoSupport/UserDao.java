package club.osai.JdbcDaoSupport;


import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserDao.java
 * @Version: 1.0
 * @Date: 2019/7/17
 * @Description:
 */

public class UserDao extends JdbcDaoSupport {

    public void update(User user) {
        String updateSql = "update sys_user u  set u.username=?, u.password=? where u.id =?";
        getJdbcTemplate().update(updateSql, user.getUsername(), user.getPassword(), user.getId());
    }

    public void delete(User user) {
        String deleteSql = "delete from sys_user u where  u.id=?";
        getJdbcTemplate().update(deleteSql, user.getId());
    }

    public User getUserById(User user) {
        String selectSql = "select * from sys_user u where u.id = ?";
        Object[] objects = {user.getId()};
        return getJdbcTemplate().queryForObject(selectSql, new User(), objects);
    }

    public List<User> getUser() {
        String selectSql = "select * from sys_user ";

        return getJdbcTemplate().query(selectSql, new User());
    }
}
