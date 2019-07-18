package test05;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import test05.User;

import java.util.List;

@Repository
public class UserDao extends JdbcDaoSupport {

//    public  void update(User user){
//        String updateSql = "update sys_user u set u.username = ?, u.password = ? where u.id = ?";
//        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
//    }
//
//    public void delete(User user){
//        String deleteSql="delete from sys_user where id = ?";
//        getJdbcTemplate().update(deleteSql,user.getId());
//    }

    public User getUserById(User user){
        String quearySql = "select * from sys_user where id = ?";
        Object[] objects = {user.getId()};
        return getJdbcTemplate().queryForObject(quearySql,new User(),objects);
    }

    public List<User> getUsers(){
        String querySql="select * from sys_user";
        return getJdbcTemplate().query(querySql,new User());
    }

}
