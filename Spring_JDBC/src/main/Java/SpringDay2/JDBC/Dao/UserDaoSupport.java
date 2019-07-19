package SpringDay2.JDBC.Dao;

import SpringDay2.JDBC.Enity.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import sun.security.jca.GetInstance;

import java.util.List;

/**
 * @Description: 使用jdbcDaoSupport操纵数据库
 * @Author: TanLinQuan
 * @Date: 2019/7/17 10:48
 * @Version: V1.0
 **/
@Repository
public class UserDaoSupport extends JdbcDaoSupport {

    public int insert(User user) {
        String insertSql = "insert into sys_uer (username,password) values (?,?);";
        return getJdbcTemplate().update(insertSql, user.getUsername(), user.getPassword());
    }

    public int update(User user) {
        String updateSql = "update sys_uer u set u.username=? , u.password=? where u.id=?;";
        return getJdbcTemplate().update(updateSql, user.getUsername(), user.getPassword(), user.getId());
    }

    public int delete(Long id) {
        String deleteSql = "DELETE FROM sys_uer  WHERE id=?;";
        return getJdbcTemplate().update(deleteSql, id);
    }
    /**
    * @Description: 普通方法
    * @Author: TanLinQuan
    * @Date: 2019/7/17 19:20
    * @params: [user]
    * @return: SpringDay2.JDBC.Enity.User
    **/
//    public User getUserById(User user) {
//        String queryUserSql = "select * from sys_uer where id=?;";
//        Object[] objects = {user.getId()};
//        return getJdbcTemplate().queryForObject(queryUserSql,new User(),objects);
//    }

    /**
    * @Description: 使用lambda表达式进行改造
    * @Author: TanLinQuan
    * @Date: 2019/7/17 19:20
    * @params: [user]
    * @return: SpringDay2.JDBC.Enity.User
    **/
    public User getUserById(User user) {
        String queryUserSql = "select * from sys_uer where id=?;";
        Object[] objects = {user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql,(rs,i) -> {
            User user1 = new User();
            user.setId(rs.getLong("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            return user1;
        },objects);
    }

    public List<User> getUser() {
        String queryUserSql = "select * from sys_uer;";
        return getJdbcTemplate().query(queryUserSql,new User());
    }

}