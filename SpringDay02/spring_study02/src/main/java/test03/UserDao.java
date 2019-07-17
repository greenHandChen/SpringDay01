package test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import test03.User;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public  void update(User user){
        String updateSql = "update sys_user u set u.username = ?, u.password = ? where u.id = ?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String deleteSql="delete from sys_user where id = ?";
        jdbcTemplate.update(deleteSql,user.getId());
    }
}
