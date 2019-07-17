package com.jqh.dao;

import com.jqh.pojo.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import javax.sql.DataSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 几米
 * @Date: 2019/7/17 09:24
 * @Description: UserDao
 */
@Repository
public class UserDao extends JdbcDaoSupport {
    @Resource(name = "dataSource")
    public void setMyDataSource(DataSource dataSource) {
                // 赋值给父类
               super.setDataSource(dataSource);
          }

    public void update(User user){
    String sql="update `user` set `username`= ? ,`password`=? where `id` =?";
    getJdbcTemplate().update(sql,user.getUsername(),user.getPassword(),user.getId());
    }
}
