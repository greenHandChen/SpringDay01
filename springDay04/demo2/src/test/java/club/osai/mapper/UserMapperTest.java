package club.osai.mapper;

import club.osai.dao.UserDao;
import club.osai.po.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void findUserById() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserMapper bean = applicationContext.getBean(UserMapper.class);
        User userById = bean.findUserById(1L);

        System.out.println(userById);
    }
}