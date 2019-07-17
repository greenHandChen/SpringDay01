package dao;

import entity.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao extends JdbcDaoSupport {

    public List<User> getUser(){
        String queryUserSql = "select * from sys_user;";
        return getJdbcTemplate().query(queryUserSql,new User());
    }
    public void update(User user){
        String updateSql = "update sys_user u set u.username = ?,u.password = ? where id = ?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());

    }
    public User getUserById(User user){
        String queryUserSql = "select * from sys_user u where u.id = ?";
        Object[] objects ={user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql,new User(),objects);
    }

    public  void delete(User user){
        String deleteSql = "delete from sys_user u where u.id= ?";
        getJdbcTemplate().update(deleteSql,user.getId());
    }
}
