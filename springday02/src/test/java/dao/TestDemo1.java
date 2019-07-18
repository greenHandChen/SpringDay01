package dao;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import po.User;

public class TestDemo1 {
    @Test
    public void testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?userUnicode-true&characterEncoding-utf-8&userSSL-false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertsql = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertsql,"hikari","123456");
    }

    @Test
    public void testJDSUserDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        JDSUserDao jDSUserDao = applicationContext.getBean("jDSUserDao",JDSUserDao.class);
        User user = new User();
        user.setId(4);
        user.setUsername("yyy");
        user.setPassword("12345");
        jDSUserDao.update(user);

    }
}
