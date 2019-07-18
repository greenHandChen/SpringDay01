package com.st.hikari.dao;

import com.st.hikari.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




@Repository
public class UserDao  {

    @Autowired
     JdbcTemplate jdbctemplate;

    public void update(User user) {
        String updateSql = "update sys_uer u set u.username=?,u.password=?where u.id=?;";
       jdbctemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(int id) {
        String deleteSql = "delete from sys_uer where id=?;";
        System.out.println(jdbctemplate.update(deleteSql,id));
    }
}
