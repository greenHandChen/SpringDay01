package com.ljx.mybatisspring.mapper;

import com.ljx.mybatisspring.dao.UserDao;
import com.ljx.mybatisspring.po.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**   测试mapper代理实现
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 14:12
 */
public class UserMapperTest {

    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(
                "config/spring/applicationContext-mapper.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        // 创建UserDao
        UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");

        User user = userMapper.findUserById(1);

        System.out.println(user);
    }
}