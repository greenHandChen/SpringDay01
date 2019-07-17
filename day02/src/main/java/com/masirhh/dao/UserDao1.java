package com.masirhh.dao;

import com.masirhh.beans.UserBean;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao1 extends JdbcDaoSupport {
    public void deleteuser(UserBean userBean){
        String sql="delete from sys_user  where id=? ";

        getJdbcTemplate().update(sql,userBean.getId());
    }

    public UserBean getUserById(UserBean userBean){
        String sql="select * from sys_user where id =?";
        Object objects[]={userBean.getId()};
        return getJdbcTemplate().queryForObject(sql,new UserBean(),objects);
    }

    public List<UserBean> getUsers(){
        String sql="select * from sys_user";
        return getJdbcTemplate().query(sql,new UserBean());
    }
}
