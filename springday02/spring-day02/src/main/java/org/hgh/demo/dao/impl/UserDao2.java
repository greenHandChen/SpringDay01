package org.hgh.demo.dao.impl;

import org.hgh.demo.pojo.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UserDao2 extends JdbcDaoSupport {
    public void update(User user){
        String updateSql = "update sys_user u set u.username = ?,u.password = ? where u.id = ?;";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void delete(Long id){
        String deleteSql = "delete from sys_user where id = ?";
        getJdbcTemplate().update(deleteSql,id);
    }

    public Integer getCount(){
        String sql = "select count(*) from sys_user";
        Integer count = getJdbcTemplate().queryForObject(sql,null,Integer.class);
        return count;
    }

    public String getUsername(Long id){
        String sql = "select username from sys_user where id = ?";
        Object[] o = {id};
        String username = getJdbcTemplate().queryForObject(sql,o,String.class);
        return username;
    }


    public List<User> getUsers(){
        String sql = "select * from sys_user";
        Object[] o = null;
        return getJdbcTemplate().query(sql,new User());
//        return getJdbcTemplate().query(sql, o, new RowMapper<User>() {
//            public User mapRow(ResultSet resultSet, int i) throws SQLException {
//                return new User(Long.parseLong(resultSet.getString("id")),resultSet.getString("username"),resultSet.getString("password"));
//            }
//        });
    }

}
