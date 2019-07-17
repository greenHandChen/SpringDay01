package huanglehao.study.Repository;

import huanglehao.study.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void update(User user){
        String updateSql="update sys_user u set u.username = ?,u.password = ? where u.id =?";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void insert(){
        String sql="insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(sql,"小丽","1314");
    }

    public void delete(){
        String sql="delete from sys_user where id = ?;";
        jdbcTemplate.update(sql,"3");
    }
}
