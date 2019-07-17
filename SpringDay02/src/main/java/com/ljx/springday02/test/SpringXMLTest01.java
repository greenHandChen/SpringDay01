package com.ljx.springday02.test;

import com.ljx.springday02.dao.Impl.PersonDaoImpl;
import com.ljx.springday02.dao.Impl.UserDaoImpl;
import com.ljx.springday02.dao.UserDao;
import com.ljx.springday02.entry.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 15:34
 */
public class SpringXMLTest01 {

    /**
     *功能描述   使用xml文件注入jdbcTemplate
     * @author LJX
     * @date 2019/7/17 15:53
     * @param  * @param
     * @return void
     */
    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDaoImpl.class);
        User user = new User();
        user.setId(2);
        user.setUsername("chenenhui");

        userDao.update(user);
    }

    /**
     *功能描述  使用阿里的数据源并且用外部文件
     * @author LJX
     * @date 2019/7/17 15:53
     * @param  * @param
     * @return void
     */
    @Test
    public void demo02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring02.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDaoImpl.class);
        User user = new User();
        user.setId(2);
        user.setUsername("ljx");

        userDao.update(user);
    }

    @Test
    public void demo03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring03.xml");
        UserDao userDao = applicationContext.getBean("personDao", PersonDaoImpl.class);
        User user = new User();
        user.setId(2);
        User user1 = userDao.getUser(user);
        System.out.println("用户名：" + user1.getUsername());
    }

    @Test
    public void demo04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring03.xml");
        UserDao userDao = applicationContext.getBean("personDao", PersonDaoImpl.class);
        User user = new User();
        user.setId(2);
        user.setUsername("ljx");

        List<User> user1 = userDao.findUser();
        for (User u :user1){
            System.out.println("用户名：" + u.getUsername());
        }

    }
}
