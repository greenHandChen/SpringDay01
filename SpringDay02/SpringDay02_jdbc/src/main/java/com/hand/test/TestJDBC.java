package com.hand.test;

import com.hand.dao.UserDao;
import com.hand.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJDBC {

    @Test
    public void testApi() {
        String source = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(source);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //查询
        List<User> userList = userDao.findAll();
        System.out.println("查询到了" + userList.size() + "条数据");
        userList.forEach(System.out::println);
        //插入
        User user = new User();
        user.setUsername("laowang");
        user.setPassword("123");
        System.out.println("插入了" + userDao.insert(user) + "条数据");
        //查询插入后的记录
        List<User> userList2 = userDao.findAll();
        userList2.forEach(System.out::println);
        //修改
        User updateUser = new User();
        updateUser.setUsername("wangjun");
        updateUser.setPassword("123456");
        System.out.println("修改了" + userDao.update(user, updateUser) + "条数据");
        //查询修改后的记录
        List<User> userList3 = userDao.findAll();
        userList3.forEach(System.out::println);
        //删除
        System.out.println("删除了" + userDao.delete(updateUser) + "条数据");
        //查询删除后的记录
        List<User> userList4 = userDao.findAll();
        userList4.forEach(System.out::println);
    }

}
