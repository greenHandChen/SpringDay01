package spring_day02.spring.d_rowMapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class RowMapperTest {

    @Test
    public void demo01(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\Springday2\\src\\main\\java\\spring_day02\\spring\\d_rowMapper\\applicationConfig.xml");
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        User user=new User();
        user.setId(1);
        User u=userDao.getUserById(user);
        System.out.println(u.toString());
    }

    @Test
    public void demo02(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\Springday2\\src\\main\\java\\spring_day02\\spring\\d_rowMapper\\applicationConfig.xml");
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        List<User> userList= userDao.getUsrs();
        System.out.println(userList);
    }
}
