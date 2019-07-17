package spring_day02.spring.b_hikari;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring_day02.spring.pojo.User;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql="update sys_user u set u.username=?,u.password=? where id=?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String deleteSql="delete from sys_user where id= ?";
        jdbcTemplate.update(deleteSql,user.getId());
    }
}
