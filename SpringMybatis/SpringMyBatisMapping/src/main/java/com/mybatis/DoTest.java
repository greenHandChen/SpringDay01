package com.mybatis;
import com.mybatis.mapper.UserMapper;
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
        UserMapper userMapper =applicationContext.getBean(UserMapper.class);
        User user = userMapper.findUserById(33);
        System.out.println(user);
    }
}
