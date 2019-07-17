import com.yonye.jdbc.dao.UserDao;
import com.yonye.jdbc.dao.UserDaoSupport;
import com.yonye.jdbc.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBCTemplate {


    @Test
    public void demo01(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();

        user.setUserName("jun");
        user.setPassword("this is password");
        userDao.insert(user);
    }

    @Test
    public void demoSupport(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        UserDaoSupport userDao=applicationContext.getBean("userDaoSupport",UserDaoSupport.class);
        User user=new User();

        user.setUserName("megen");
        user.setPassword("this is password");
         userDao.insert(user);
    }

    @Test
    public void demoSupportForQuery(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        UserDaoSupport userDao=applicationContext.getBean("userDaoSupport",UserDaoSupport.class);
        User user=new User();
        user.setId(1L);
       User u=userDao.getUserById(user);
        System.out.println("=======");
    }
}
