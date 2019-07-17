import com.hand.lq.dao.UserDao;
import com.hand.lq.dao.UserDao2;
import com.hand.lq.pojo.User;
import com.hand.lq.pojo.User2;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class testHikariCP {
    @Test
    public void testApi() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/java_web?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("1234");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String select = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(select, "adasd", "12314");
    }

    @Test
    public void AA() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(1L);
        user.setUsername("assasadad213d");
        user.setPassword("asd");
        userDao.update(user);

    }

    @Test
    public void AA2() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        UserDao2 userDao2 = applicationContext.getBean("userDao2", UserDao2.class);
        User user = new User();
        user.setId(1L);
        user.setUsername("csdfsdf");
        user.setPassword("asdsfd");
        userDao2.update(user);
    }
    @Test
    public void AA3() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        UserDao2 userDao2 = applicationContext.getBean("userDao2", UserDao2.class);
        User2 user2 = new User2();
        user2.setId(1L);
       List<User2> list=userDao2.getAll();
       User2 user21=userDao2.getById(user2);
        System.out.println(list);
        System.out.println(user21);
    }
}
