package Dao;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao extends JdbcDaoSupport {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String sql="update sys_user u set u.username = ? ,u.password = ? where id=?";
        getJdbcTemplate().update(sql,user.getName(),user.getPassword(),user.getId());
    }
    public void delete (User user){
        String  sql="delete sys_user u where u.id=?";
//        jdbcTemplate.update(sql,user.getId());

        getJdbcTemplate().update(sql,user.getId());
    }

    public User getUserById(User user){
        String Sql = "select * from sys_user u where u.id = ? ";
        Object[] objects={user.getId()};
        return getJdbcTemplate().queryForObject(Sql, new User(), objects);
    }

    public List<User> getUsers(){
        String sql="select * from sys_user";
        return getJdbcTemplate().query(sql,new User());
    }
}
