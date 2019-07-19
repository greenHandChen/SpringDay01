package com;

import com.dao.IUserDao;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 23:20 2019/7/18
 * @Modified By:
 */
public class TestUserDao {
    @Test
    public void testFindUserById() throws BeansException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        IUserDao userDao = applicationContext.getBean("userDao", IUserDao.class);
        System.out.println(userDao.findUserById(1));
    }

}
