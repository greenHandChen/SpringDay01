package dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import po.User;

public class JDSUserDao extends JdbcDaoSupport {

    public void update(User user){
        String  updatesql = "update sys_user u set u.username = ?, u.password = ? where u.id=?";
        getJdbcTemplate().update(updatesql,user.getUsername(),user.getPassword(),user.getId());
    }
    public  void delete(User user){
        String delsql = "delete from sys_user where id = ?";
        getJdbcTemplate().update(delsql,user.getId());
    }
}
