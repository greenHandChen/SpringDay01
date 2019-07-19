package testSpringMybatis;

import com.mybatis.pojo.User;
import com.spring_mybatis.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpringMybatis {
    //基于手动实现接口类
    @Test
    public void testSpringMybatis(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis/applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        System.out.println(userDao.findUserById(27));
    }
}
