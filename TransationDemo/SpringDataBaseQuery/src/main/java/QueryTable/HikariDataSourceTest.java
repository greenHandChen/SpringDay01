package QueryTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HikariDataSourceTest extends JdbcDaoSupport {

  /*  @Autowired
    private JdbcTemplate jdbcTemplate;  //自动注入jdbcTemplate 即使吧 Hikari数据源引入;
*/
    public User getUser(User user){
        String usql = "select * from sys_user s where s.id = ? ;";
        Object[] objects = {user.getId()};
        getJdbcTemplate().queryForObject(usql,objects,new User());
        return user;
    }

    public List<User> getUserByNone(){
        String qsql = "select * from sys_user;";
        return getJdbcTemplate().query(qsql,new User());
    }
}
