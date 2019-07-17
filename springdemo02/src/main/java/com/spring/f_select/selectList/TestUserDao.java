package com.spring.f_select.selectList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
                "D:\\codeSofe\\coding\\IdeaProjects\\springdemo02\\src\\main\\java\\com\\spring\\f_select\\selectList\\applicationContext.xml");

        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        System.out.println("用户集合："+userDao.getUsers());
    }
}
