package com.jmx.dao;

import com.jmx.pojo.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;


public class UserDao extends JdbcDaoSupport{
        /*@Autowired
        private JdbcTemplate jdbcTemplate;
*/
        public void update(User user){
            String update_sql="update sys_user u set u.username=?,u.password=? where u.id=? ";
        //jdbcTemplate.update(update_sql,user.getUsername(),user.getPassword(),user.getId());
          getJdbcTemplate().update(update_sql,user.getUsername(),user.getPassword(),user.getId());

        }
        public void delete(User user){
            //System.out.println(jdbcTemplate);
            String delete_sql="delete from sys_user u where u.id=?";
            getJdbcTemplate().update(delete_sql,user.getId());
        }
        public void insert(User user){
              String insert_sql="insert into sys_user(username,password) values(?,?)";
              getJdbcTemplate().update(insert_sql,user.getUsername(),user.getPassword());


        }
        public User getUserById(User user){
              String selet_sql="select * from sys_user where id=?";
              Object[] objects={user.getId()};
             return getJdbcTemplate().queryForObject(selet_sql,new User(),objects);
        }
        public List<User> getUsers(){
               String select_sql="select * from sys_user;";
               return getJdbcTemplate().query(select_sql,new User());
        }
}
