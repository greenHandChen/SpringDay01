package com.hand.sysmanager.spring.jdbc;

import com.hand.sysmanager.spring.bean.SysUser;
import com.hand.sysmanager.spring.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 9:39
 */
public class TestHikari
{
    ApplicationContext applicationContext;
    @Before
    public void init()
    {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUserDao()
    {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        SysUser user = new SysUser();
        user.setId(3L);
        user.setPassword("123");
        user.setUsername("hello");
        userDao.updateUser(user);
    }

    @Test
    public void testDeleteUser()
    {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.deleteUser(3L);
    }
}
