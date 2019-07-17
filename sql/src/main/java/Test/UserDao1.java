package Test;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao1 extends JdbcDaoSupport {
    public void update(User user){
        String updateSql = "update sys_user u set u.username =? ,u.password=? where is u.id?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }
}
