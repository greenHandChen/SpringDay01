package com.hand.sysmanager.spring.dao;

import com.hand.sysmanager.spring.bean.SysUser;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 10:34
 */
public class UserDaoSupport extends JdbcDaoSupport {

    public void updateUser(SysUser user){
        String updateSql = "update sys_user u set u.username = ? , password = ? where id = ?;";
        this.getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void selectSimple()
    {
        String countSql = "select count(*) from sys_user;";
        Integer c = getJdbcTemplate().queryForObject(countSql, null, Integer.class);
        System.out.println(c);
    }

    public void selectSimple02()
    {
        String countSql = "select username from sys_user u where u.id = ?";
        Object[] objects = {2L};
        String rst =  getJdbcTemplate().queryForObject(countSql, objects, String.class);

        System.out.println(objects.toString());
    }

    public SysUser findUserById(SysUser user)
    {
        String queryUserSql ="select * from sys_user where id = ?";
        Object[] objects  = {user.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql, new SysUser(),objects);
    }
    public List<SysUser> getUsers()
    {
        String queryUserSql = "select * from sys_user";
        return getJdbcTemplate().query(queryUserSql,new SysUser());
    }
}
