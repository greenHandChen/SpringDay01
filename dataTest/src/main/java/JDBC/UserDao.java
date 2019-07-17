package JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends JdbcDaoSupport {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String updateSql = "update sys_user u set u.username = ?, u.password = ? where id = ?";
//        jdbcTemplate .update(updateSql,user.getUsername(),user.getPassword(),user.getId());
        getJdbcTemplate() .update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(User user){
        String delSql = "delete from sys_user u where u.id = ?";
//        jdbcTemplate.update(delSql, user.getId());
        getJdbcTemplate().update(delSql, user.getId());
    }

    public int count(){
        String countSql = "select count(*) from sys_user";
        Integer c = getJdbcTemplate().queryForObject(countSql,null,Integer.class);
        return c;
    }

    public String select(){
        String sql = "select username from sys_user u where u.id = ?";
        Object[] objects = {3L};
        String rst = getJdbcTemplate().queryForObject(sql,objects,String.class);
        return rst;
    }
}
