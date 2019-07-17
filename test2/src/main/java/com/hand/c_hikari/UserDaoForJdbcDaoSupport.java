package com.hand.c_hikari;

import com.hand.a_damain.User;
import org.junit.Test;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/17
 */
@Repository
public class UserDaoForJdbcDaoSupport extends JdbcDaoSupport {

    /**
     * @author:  HuangHeng
     * @description  修改用户数据
     * @CreateDate:  2019/7/17
     */
    public int updatetUser(User user){
        String sql="update sys_user set username = ?,password = ? where id = ?;";
        return getJdbcTemplate().update(sql, user.getUsername(), user.getPassword(), user.getId());
    }

    /**
     * @author:  HuangHeng
     * @description  根据id删除用户
     * @CreateDate:  2019/7/17
     */
    @Test
    public void deleteUser(User user){
        String sql="delete from sys_user where id = ?;";
        System.out.println(this.getJdbcTemplate().update(sql, user.getId()));
    }

    /**
     * @author:  HuangHeng
     * @description  查询所有的用户
     * @CreateDate:  2019/7/17
     */
    public List<User> getUser(){
        String sql="select * from sys_user;";
        return getJdbcTemplate().query(sql,new User());
    }

    /**
     * @author:  HuangHeng
     * @description  根据用户id查询用户
     * @CreateDate:  2019/7/17
     */
    public List<User> getUserAllById(User user){
        String sql="select * from sys_user where id = ?;";
        Object[] objects={user.getId()};
        return getJdbcTemplate().query(sql,new User(),objects);
    }

    /**
     * @author:  HuangHeng
     * @description  插入用户数据
     * @CreateDate:  2019/7/17
     */
    public int insertUser(User user){
        String sql="insert into sys_user(username,password) values(?,?);";
        return getJdbcTemplate().update(sql, user.getUsername(), user.getPassword());
    }
}
