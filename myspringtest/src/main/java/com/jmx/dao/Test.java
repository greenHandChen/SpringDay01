package com.jmx.dao;

import com.jmx.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
       public void demo01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
        UserDao userDao= (UserDao) ctx.getBean("userDao");
        User user=new User();
        user.setId(1);
        user.setPassword("123");
        user.setUsername("xxx");
        userDao.update(user);
    }
    public void demo02(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
        UserDao userDao= (UserDao) ctx.getBean("userDao");
        User user=new User();
        user.setId(2);
        userDao.delete(user);
    }
    public void demo03(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
        UserDao userDao= (UserDao) ctx.getBean("userDao");
        User user=new User();
        user.setPassword("123");
        user.setUsername("xxx");
        userDao.insert(user);

    }
    public void demo04(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
        UserDao userDao= (UserDao) ctx.getBean("userDao");
        User user=new User();
        user.setId(5);
        User u=userDao.getUserById(user);
        System.out.println(u);

    }
    public void demo05(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
        UserDao userDao= (UserDao) ctx.getBean("userDao");
        List<User> list=userDao.getUsers();
        System.out.println(list.get(1).getUsername()+list.size());


    }

       public static void main(String args[]){
              Test t=new Test();
              t.demo05();


       }
}
