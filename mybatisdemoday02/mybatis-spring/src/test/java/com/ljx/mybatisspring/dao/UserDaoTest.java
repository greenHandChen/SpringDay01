package com.ljx.mybatisspring.dao;

import com.ljx.mybatisspring.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**   测试原始dao开发方式
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 13:59
 */
public class UserDaoTest {

    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(
                "config/spring/applicationContext-dao.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        // 创建UserDao
        UserDao dao = (UserDao) ctx.getBean("userDao");

        User user = dao.findUserById(1);

        System.out.println(user);
    }
}