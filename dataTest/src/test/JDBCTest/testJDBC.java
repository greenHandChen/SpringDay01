package JDBCTest;

import JDBC.User;
import JDBC.UserDao;
import com.zaxxer.hikari.HikariDataSource;
import demo2.User2;
import demo2.UserDao2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class testJDBC {

    @Test
    public void testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"hikari","123456");
    }

    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(2L);
        user.setUsername("2019/07/17");
        user.setPassword("16:48");
//        userDao.update(user);
//        userDao.delete(user);
//        System.out.println(userDao.count());
        System.out.println(userDao.select());
    }

    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringContext.xml");
        UserDao2 userDao = (UserDao2) applicationContext.getBean("userDao2");
        User2 user = new User2();
        user.setId(2L);
        System.out.println(userDao.getUserId(user).toString());
        System.out.println(userDao.getUsers());
    }
}
