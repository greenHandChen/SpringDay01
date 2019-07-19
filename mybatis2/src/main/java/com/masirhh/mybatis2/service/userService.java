package com.masirhh.mybatis2.service;

import com.masirhh.mybatis2.beans.userBean;
import com.masirhh.mybatis2.dao.userDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;



public class userService {
    private ApplicationContext applicationContext;

    @Before
    public void setup() throws Exception {
         applicationContext = new
                ClassPathXmlApplicationContext("config/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        // 通过配置资源对象获取 userDAO 对象
        userDao userDAO = (userDao) applicationContext.getBean("userDao");
        // 调用 UserDAO 的方法
        userBean user = userDAO.findUserById(1);
        // 输出用户信息
        System.out.println(user.toString());
    }
}
