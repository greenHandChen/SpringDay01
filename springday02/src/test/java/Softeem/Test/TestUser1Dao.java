package Softeem.Test;

import com.softeem.spring.User1;
import com.softeem.springdao.User1Dao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUser1Dao {

    @Test
    public void queryUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1Dao user1Dao = applicationContext.getBean("user1Dao", User1Dao.class);
        User1 user1 = user1Dao.getUser1ByUid(4);
        System.out.println(user1);

    }

    @Test
    public void queryMoreUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1Dao user1Dao = applicationContext.getBean("user1Dao", User1Dao.class);
        User1 user1 = new User1();
        List<User1> list = user1Dao.getListUser();
        //User1 user1 = user1Dao.getListUser;
        System.out.println(user1);

    }
}
