package com.hand.sysmanager.spring.dao;

import com.hand.sysmanager.spring.bean.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 9:29
 */
@Component
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateUser(SysUser user)
    {
        String updateSql = "update sys_user u set u.username = ? , password = ? where id = ?;";
        jdbcTemplate.update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void deleteUser(Long id)
    {
        String deleteSql = "delete from sys_user where id =?;";
        jdbcTemplate.update(deleteSql,id);
    }
}
