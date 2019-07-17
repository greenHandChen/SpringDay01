package springDay02.demo2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springDay02.demo2.pojo.User;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
@Repository
public class UserDao {
    /*
    * 但这里还是需要我们每次创建JdbcTemplate对象，如何让每个Dao类都自己含有JdbcTemplate对象呢？ ==> demo3
    *
    * */

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(User user){
        String sql = "insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(sql, "newUsername","newPassword");
    }

    public void update(User user){
        String updateSQL = "update sys_user u set u.username = ?, u.password = ? where id = ?";
        jdbcTemplate.update(updateSQL, user.getUsername(), user.getPassword(), user.getId());
    }

    public void delete(User user){
        String sql = "delete from sys_user where id = ?;";
        jdbcTemplate.update(sql, user.getId());
    }

}
