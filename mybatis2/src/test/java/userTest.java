import dao.UserDao;
import domain.User;
import mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userTest {
    private ApplicationContext applicationContext;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }
    @Test
    public void demo1(){
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserByUserId(1);
        System.out.println(user);
    }

    @Test
    public void demo2(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}
