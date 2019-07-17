package spring_day02.spring.c_jdbcSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import spring_day02.spring.pojo.User;

@Repository
public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String updateSql="update sys_user u set u.username=?,u.password=? where id=?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String deleteSql="delete from sys_user where id= ?";
        getJdbcTemplate().update(deleteSql,user.getId());
    }

    public void qureryAll(){
        String countSql="select count(*) from sys_user;";
        Integer c=getJdbcTemplate().queryForObject(countSql,null,Integer.class);
        System.out.println(c);
    }

    public void queryByID(){
        String countSql = "select username from sys_user u where u.id = ?";
        Object[] objects = {1};
        String rst =  getJdbcTemplate().queryForObject(countSql, objects, String.class);
        System.out.println("name;"+rst);
    }
}
