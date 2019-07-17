package test;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;
import dao.UserDao;
import entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.jws.soap.SOAPBinding;

public class TestJDBC {
    @Test
    public  void testApi(){
       HikariDataSource hikaeriDataSoruce = new HikariDataSource();
        hikaeriDataSoruce.setDriverClassName("com.mysql.jdbc.Driver");
        hikaeriDataSoruce.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikaeriDataSoruce.setUsername("root");
        hikaeriDataSoruce.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikaeriDataSoruce);
        String insertSql = "insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"hikari","123456");
    }
    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ceh/spring/c_hikari/beans.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(1L);
        user.setUsername("2019/07/05");
        user.setPassword("10.24");
        userDao.update(user);
    }

}
