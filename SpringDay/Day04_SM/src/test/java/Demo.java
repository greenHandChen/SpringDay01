import day04_sm.dao.UserDao;
import day04_sm.domain.User;
import day04_sm.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public class Demo {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);

        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}
