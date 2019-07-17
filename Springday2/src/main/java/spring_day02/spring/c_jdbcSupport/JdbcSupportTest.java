package spring_day02.spring.c_jdbcSupport;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import spring_day02.spring.c_jdbcSupport.UserDao;
import spring_day02.spring.pojo.User;

public class JdbcSupportTest {

    @Test
    public void demo(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\Springday2\\src\\main\\java\\spring_day02\\spring\\c_jdbcSupport\\applicationConfig.xml");
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        User user=new User();
        user.setId(3);
        userDao.delete(user);
    }

    @Test
    public void demo01(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\Springday2\\src\\main\\java\\spring_day02\\spring\\c_jdbcSupport\\applicationConfig.xml");
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        userDao.qureryAll();
    }

    @Test
    public void demo02(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\Springday2\\src\\main\\java\\spring_day02\\spring\\c_jdbcSupport\\applicationConfig.xml");
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        userDao.queryByID();
    }
}
