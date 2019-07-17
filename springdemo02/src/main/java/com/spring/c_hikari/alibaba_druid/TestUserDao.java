package com.spring.c_hikari.alibaba_druid;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
                "D:\\codeSofe\\coding\\IdeaProjects\\springdemo02\\src\\main\\java\\com\\spring\\c_hikari\\alibaba_druid\\applicationContext.xml");

        UserDao userDao= (UserDao) applicationContext.getBean("druidUserDao");
        if(userDao.update()>=1){
            System.out.println("druid更新成功");
        }else{
            System.out.println("druid更新失败");
        }
        if(userDao.delete()>=1){
            System.out.println("druid删除成功");
        }else{
            System.out.println("druid删除失败");
        }
        if(userDao.insert()>=1){
            System.out.println("druid新增成功");
        }else{
            System.out.println("druid新增失败");
        }
    }
}
