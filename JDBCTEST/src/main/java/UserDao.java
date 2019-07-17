import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String sql="update sys_user set username=? ,password=? where id=?";
        getJdbcTemplate().update(sql,user.getUsername(),user.getPassword(),user.getId());
    }
    public void delete(User user){
        String sql="delete from sys_user  where id=?";
        getJdbcTemplate().update(sql,user.getId());
    }

    public User getById(User user){
        String queryUserSql="select * from sys_user where id=?";
        Object[] object={user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql,new User(),object);
    }
     public List<User> queryAll(){
        String queryUserSql="select * from sys_user";
        return getJdbcTemplate().query(queryUserSql,new User());
     }
}
