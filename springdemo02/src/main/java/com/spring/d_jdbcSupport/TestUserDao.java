package com.spring.d_jdbcSupport;

import com.spring.c_hikari.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
                "D:\\codeSofe\\coding\\IdeaProjects\\springdemo02\\src\\main\\java\\com\\spring\\d_jdbcSupport\\applicationContext.xml");

        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        if(userDao.update()>=1){
            System.out.println("jdbcSupport更新成功");
        }else{
            System.out.println("jdbcSupport更新失败");
        }
        if(userDao.delete()>=1){
            System.out.println("jdbcSupport删除成功");
        }else{
            System.out.println("jdbcSupport删除失败");
        }
        if(userDao.insert()>=1){
            System.out.println("jdbcSupport新增成功");
        }else{
            System.out.println("jdbcSupport新增失败");
        }
    }
}
