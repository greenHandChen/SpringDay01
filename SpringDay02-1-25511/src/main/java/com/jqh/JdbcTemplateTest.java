package com.jqh;

import com.jqh.dao.UserDao;
import com.jqh.pojo.User;
import com.jqh.util.BeanUtil;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Auther: 几米
 * @Date: 2019/7/17 09:01
 * @Description: JdbcTemplateTest
 */
public class JdbcTemplateTest {





    @Test
    public void testJdbc(){
        JdbcTemplate jdbcTemplate= BeanUtil.getBean(JdbcTemplate.class);
//        String sql = "insert into `user` (`username`,`password`) values(?,?)";
//        jdbcTemplate.update(sql, "小丽","password");
        String sql = "update `user` set `username`= ? where `id` =?";
        jdbcTemplate.update(sql, "小明", 1);
//        String sql = "delete from `user` where `id` =?";
//        jdbcTemplate.update(sql, 1);
    }

    @Test
    public void testDao(){
      UserDao userDao= BeanUtil.getBean(UserDao.class);
userDao.update(new User(2,"小卡","password"));
    }

}
