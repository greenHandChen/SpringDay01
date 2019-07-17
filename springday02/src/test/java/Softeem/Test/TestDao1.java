package Softeem.Test;

import com.softeem.spring.User;
import com.softeem.springdao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao1 {

    @Test
    //不能修改
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(3);
        user.setName("老k");
        user.setPassword("199761");
        userDao.update(user);


    }

    @Test
    public  void demo2(){
       ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("applicationContext.xml");
       UserDao userDao =  applicationContext.getBean("userDao",UserDao.class);
       //User user = new User();

       userDao.delete(4);
    }
}
