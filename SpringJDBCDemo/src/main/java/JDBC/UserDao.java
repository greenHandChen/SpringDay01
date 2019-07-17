package JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao extends JdbcDaoSupport {
    @Autowired
    private  JdbcTemplate jdbcTemplate;
    public void update(User user)
    {
        String updateSql="update sys_user set usernmae=?,userpwd=? where id=?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getUserpwd(),user.getId());
    }
    public void delete(User user)
    {
        String deleteSql="delete from sys_user  where id=?";
        jdbcTemplate.update(deleteSql,user.getId());
    }

    public User getUserById(User user){
        String queryUserSql="select * from sys_user where id=?";
        Object[] objects ={user.getId()};
        return this.jdbcTemplate.queryForObject(queryUserSql, new User(),objects);
    }
    public List<User> getUser(){
        String queryUserSql="select * from sys_user;";
        return this.jdbcTemplate.query(queryUserSql,new User());
    }
}
