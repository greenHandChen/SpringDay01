package com.spring.f_select.selectObject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
                "D:\\codeSofe\\coding\\IdeaProjects\\springdemo02\\src\\main\\java\\com\\spring\\f_select\\selectObject\\applicationContext.xml");

        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        System.out.println("id为3的用户名为"+userDao.getUserById(3));
        System.out.println("id为3的用户名为"+userDao.getUserById2(3));
    }
}
