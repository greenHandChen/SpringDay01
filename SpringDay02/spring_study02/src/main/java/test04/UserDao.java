package test04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends JdbcDaoSupport {

    public  void update(User user){
        String updateSql = "update sys_user u set u.username = ?, u.password = ? where u.id = ?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String deleteSql="delete from sys_user where id = ?";
        getJdbcTemplate().update(deleteSql,user.getId());
    }
}
