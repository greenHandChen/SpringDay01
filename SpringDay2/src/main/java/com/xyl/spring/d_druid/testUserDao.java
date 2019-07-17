package com.xyl.spring.d_druid;

import javafx.application.Application;

public class testUserDao {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
                "C:\\Users\\75741\\IdeaProjects\\SpringDay01\\SpringDay2\\src\\main\\java\\com\\xyl\\spring\\d_druid\\applicationContext.xml");

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
