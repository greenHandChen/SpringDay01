package SpringDay2.JDBC.Dao;

import SpringDay2.JDBC.Enity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Description: UserMapper
 * @Author: TanLinQuan
 * @Date: 2019/7/17 10:12
 * @Version: V1.0
 **/
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
    * @Description: 用户信息更新
    * @Author: TanLinQuan
    * @Date: 2019/7/17 10:32
    * @params: [user]
    * @return: void
    **/
    public void update(User user) {
        String updateSql = "update sys_uer u set u.username=?,u.password=?where u.id=?;";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(Long id) {
        String deleteSql = "DELETE FROM sys_uer WHERE id=?;";
//        jdbcTemplate.update(deleteSql,id);
        System.out.println(jdbcTemplate.update(deleteSql,id));
    }
}
