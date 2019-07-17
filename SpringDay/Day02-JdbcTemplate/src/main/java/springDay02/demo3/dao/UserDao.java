package springDay02.demo3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import springDay02.demo3.pojo.User;

import javax.sql.DataSource;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
//@Repository
public class UserDao extends JdbcDaoSupport {

    public void insert(User user){
        String sql = "insert into sys_user(username,password) values(?,?);";
        getJdbcTemplate().update(sql, "newUsername","newPassword");
    }

    public void update(User user){
        String updateSQL = "update sys_user u set u.username = ?, u.password = ? where id = ?";
        getJdbcTemplate().update(updateSQL, user.getUsername(), user.getPassword(), user.getId());
    }

    public void delete(User user){
        String sql = "delete from sys_user where id = ?;";
        getJdbcTemplate().update(sql, user.getId());
    }

}
