package d_druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
//import org.springframework.jdbc.core.support.JdbcDaoSupport;

@Repository
public class UserDao /*extends JdbcDaoSupport*/ {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql = "update sys_user u set u.username = ?,u.password = ? where id = ?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
//        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){

        String deleteSql = "delete from sys_user u where u.id = ?";
        jdbcTemplate.update(deleteSql,user.getId());
//        getJdbcTemplate().update(deleteSql,user.getId());
    }
}
