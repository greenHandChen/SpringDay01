package com.hand.sysmanager.test;

import com.hand.sysmanager.entity.User;
import com.hand.sysmanager.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/19 16:44
 */
public class UserTest {
    private ApplicationContext ac = null;



    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        User user = userService.findUserById(10L);
        System.out.println(user.getUsername());
    }
}
