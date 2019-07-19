import com.sy.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserDaoTest {
    @Test
    public void userDaoTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/SpringBeanConfig.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao.findByUserId(1));
    }
}
