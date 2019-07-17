package com.xyh.Jdbc.Repository;

import com.xyh.Jdbc.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("userDao1")
public class UserDao1 extends JdbcDaoSupport {

    public UserDao1(@Autowired DataSource dataSource){
        setDataSource(dataSource);
    }

    public User getUserById(User user){
        String sql="select * from sys_user where id=?";
        Object[] objects={user.getId()};
        return getJdbcTemplate().queryForObject(sql,new User(),objects);
    }

    public List<User> selectAll(){
        String sql="select * from sys_user";
        return getJdbcTemplate().query(sql,(rs,i)->{
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            return user;
        });
    }
}
