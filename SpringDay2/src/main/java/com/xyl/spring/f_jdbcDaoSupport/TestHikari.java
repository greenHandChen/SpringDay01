package com.xyl.spring.f_jdbcDaoSupport;

import org.apache.catalina.core.ApplicationContext;

public class TestHikari {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
                "C:\\Users\\75741\\IdeaProjects\\SpringDay01\\SpringDay2\\src\\main\\java\\com\\xyl\\spring\\f_jdbcDaoSupport\\applicationContext.xml");

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
