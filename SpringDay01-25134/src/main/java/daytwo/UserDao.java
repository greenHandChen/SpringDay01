package daytwo;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void update(User user){
        String updateSql="update sys_user u set u.username=?,u.password=? where id=?;";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }
}