package com.spring.c_hikari;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
                "D:\\codeSofe\\coding\\IdeaProjects\\springdemo02\\src\\main\\java\\com\\spring\\c_hikari\\applicationContext.xml");

        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        if(userDao.update()>=1){
            System.out.println("hikari更新成功");
        }else{
            System.out.println("hikari更新失败");
        }
        if(userDao.delete()>=1){
            System.out.println("hikari删除成功");
        }else{
            System.out.println("hikari删除失败");
        }
        if(userDao.insert()>=1){
            System.out.println("hikari新增成功");
        }else{
            System.out.println("hikari新增失败");
        }
    }
}
