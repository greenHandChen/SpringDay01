package spring_day02.spring.d_rowMapper;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class   UserDao extends JdbcDaoSupport {

    public User getUserById(User user){
        String queryUserSql="select * from sys_user u where u.id=?";
        Object[] object={user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql,new User(),object);
    }

    public List<User> getUsrs(){
        String queryUserSql="select * from sys_user";
        return getJdbcTemplate().query(queryUserSql,new User());
    }
}
