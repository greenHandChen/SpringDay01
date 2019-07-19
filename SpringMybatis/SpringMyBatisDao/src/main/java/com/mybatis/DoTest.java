package com.mybatis;

import com.mybatis.dao.UserDaoImpl;
import com.mybatis.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 测试类
 * @author: xueWu.Chen
 * @create: 2019-07-19
 **/

public class DoTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao = (UserDaoImpl)applicationContext.getBean("userDao");
        User user = userDao.getUserById(33);
        System.out.println(user.getUsername());
    }
}
