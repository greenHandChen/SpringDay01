package com.spring.f_select.simpleSelect;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends JdbcDaoSupport {

    public int selectRows(){
        String selectSql="select count(1) from sys_user";
        Integer i = getJdbcTemplate().queryForObject(selectSql,null,Integer.class);
        System.out.println("总行数为："+i);
        return i;
    }

    public String selectUserNameById(Integer id){
        String selectSql="select username from sys_user u where u.id = ?";
        return getJdbcTemplate().queryForObject(selectSql,new Object[]{id},String.class);
    }
}
