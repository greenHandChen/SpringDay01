package com.hand.wqw.dao;

import com.hand.wqw.bean.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UserDaoSupport extends JdbcDaoSupport {

    /**
     * 查询用户数
     * @return
     */
    public int selectCount(){
        String sql = "select count(1) from sys_user";
        return super.getJdbcTemplate().queryForObject(sql, null, Integer.class);
    }

    public String selectUserName(Integer id){
        String sql = "select username from sys_user where id = ?";
        return super.getJdbcTemplate().queryForObject(sql, new Object[]{id}, String.class);
    }

    public User seelctUser(Integer id){
        String sql = "select * from sys_user where id = ?";
        return super.getJdbcTemplate().queryForObject(sql,new User(), new Object[]{id});
    }

    public List<User> selectUsers() {
        String sql = "select * from sys_user";
        return super.getJdbcTemplate().query(sql, new User());
    }
}
