package com.yonye.jdbc.dao;

import com.yonye.jdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
//继承JdbcDaoSupport不需要再配置jdbcTemplate的bean，再父类中同时注入数据源
public class UserDaoSupport extends JdbcDaoSupport {


        public void update(User user){
            String updateSql="update sys_user u set u.username=?,u.password=?where id=?";
            getJdbcTemplate().update(updateSql,user.getUserName(),user.getPassword(),user.getId());
        }

        public void insert(User user){
            String insertSql="insert into sys_user (username,password) values(?,?);";
            getJdbcTemplate().update(insertSql,user.getUserName(),user.getPassword());
        }


        public void delete(User user){
            String delSql="delete from customers where id=?";
            getJdbcTemplate().update(delSql,user.getId());
        }

    public User getUserById(User user){
        String queryUserSql="select* from sys_user u where u.id=?";
        Object[] objects={user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql, (RowMapper<User>) new User(),objects);
    }

}
