package ApplicationTest;

import Dao.UserDao;
import Entity.User;
import Mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

    @Test
    public void findUserByIdTest() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        UserDao userDao = (UserDao)ctx.getBean("userDao");
//
//        User user1 = userDao.findUserById(1);
//
//        user1.getAllInfo();

        UserMapper userMapper = (UserMapper)ctx.getBean("userMapper");

        User user2 = userMapper.findUserById(1);

        user2.getAllInfo();
    }
}
