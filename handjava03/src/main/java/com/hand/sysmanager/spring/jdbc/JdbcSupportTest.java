package com.hand.sysmanager.spring.jdbc;

import com.hand.sysmanager.spring.bean.SysUser;
import com.hand.sysmanager.spring.dao.UserDaoSupport;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 10:41
 */
public class JdbcSupportTest {
    ApplicationContext applicationContext;
    @Before
    public void init()
    {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testUpdateUser()
    {
        UserDaoSupport userDaoSupport = (UserDaoSupport) applicationContext.getBean("userDaoSupport");
        SysUser user = new SysUser();
        user.setId(2L);
        user.setPassword("123");
        user.setUsername("hello");
        userDaoSupport.updateUser(user);
    }

    /**
     * @Description: 简单查询
     * @Param: []
     * @return: void
     * @Author: LWY
     * @Date: 2019/7/17 10:49 
     */
    @Test
    public void querySimple()
    {

        UserDaoSupport userDaoSupport = (UserDaoSupport) applicationContext.getBean("userDaoSupport");
        userDaoSupport.selectSimple();
    }
    @Test
    public void querySimple02()
    {

        UserDaoSupport userDaoSupport = (UserDaoSupport) applicationContext.getBean("userDaoSupport");
        userDaoSupport.selectSimple02();
    }

    @Test
    public void findUserById()
    {
        UserDaoSupport userDaoSupport = (UserDaoSupport) applicationContext.getBean("userDaoSupport");
        SysUser user  =  new SysUser();
        user.setId(2L);
        user = userDaoSupport.findUserById(user);
        System.out.println(user);
    }

    @Test
    public void getUsers()
    {
        List<SysUser> list = new ArrayList<SysUser>();
        UserDaoSupport userDaoSupport = (UserDaoSupport) applicationContext.getBean("userDaoSupport");
        list = userDaoSupport.getUsers();
        System.out.println(list);


    }
}
