package druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao_jds extends JdbcDaoSupport {

    public void update(User user){
        String updateSql = "update sys_user u set u.username = ?,u.password = ? where id = ?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String deleteSql = "delete from sys_user u where u.id = ?";
        getJdbcTemplate().update(deleteSql,user.getId());
    }

    /**
     * @Author: MikeLv
     * @Description: 插入数据
     * @Date: 2019/7/17 22:53
     */

    public void insert(User user){
        String insertSql = "insert into sys_user(username,password) values(?,?)";
        getJdbcTemplate().update(insertSql,user.getUsername(),user.getPassword());
    }

    public User getUserById(User user){
        String queryUserSql = "select * from sys_user u where u.id = ?";
        Object[] objects = {user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql,new User(),objects);
    }

    public List<User> getUsers(){
        String queryUserSql = "select * from sys_user";
        return getJdbcTemplate().query(queryUserSql,new User());
    }
}
