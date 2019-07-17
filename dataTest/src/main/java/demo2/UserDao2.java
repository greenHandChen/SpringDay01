package demo2;

import JDBC.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao2 extends JdbcDaoSupport {
    public User2 getUserId(User2 user){
        String sql = "select * from sys_user u where u.id = ?";
        Object[] objects = {user.getId()};
        return getJdbcTemplate().queryForObject(sql,new User2(),objects);
    }

    public List<User2> getUsers(){
        String sql = "select * from sys_user";
        return getJdbcTemplate().query(sql, new User2());
    }
}
