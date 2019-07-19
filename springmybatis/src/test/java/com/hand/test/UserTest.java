package com.hand.test;

import com.hand.sysmanager.dao.IUserDao;
import com.hand.sysmanager.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/19 16:39
 */
public class UserTest extends BaseTest {


    private ApplicationContext ac = null;




    @Test
    public  void  testFindUserById()
    {
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) ac.getBean("userDaoImpl");
        User user = userDao.findUserById(10L);
        System.out.println(user);
    }
}
