package druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql = "update sys_user u set u.username = ?,u.password = ? where id = ?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String deleteSql = "delete from sys_user u where u.id = ?";
        jdbcTemplate.update(deleteSql,user.getId());
    }

    /**
      * @Author: MikeLv
      * @Description: 插入数据
      * @Date: 2019/7/17 22:53
      */

    public void insert(User user){
        String insertSql = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertSql,user.getUsername(),user.getPassword());
    }
}
