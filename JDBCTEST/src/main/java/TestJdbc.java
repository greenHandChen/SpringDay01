import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TestJdbc {
    @Test
    public void testApi(){
        HikariDataSource HikariDataSource=new HikariDataSource();
        HikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        HikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?Unicode=true&characterEncoding-utf-8");
        HikariDataSource.setUsername("root");
        HikariDataSource.setPassword("root");
        JdbcTemplate jdbcTemplate=new JdbcTemplate(HikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertSql, "hejunf","121333");

    }
    @Test
    public void testJDBC(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplactionConfig.xml");
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        User user=new User();
        user.setId(2);
        user.setUsername("nalatuo");
        user.setPassword("sasige");
        /*userDao.update(user);
        userDao.delete(user);*/
        User user1 = userDao.getById(user);
        List<User> user2 =userDao.queryAll();
        System.out.println(user1.toString());
        for (User users: user2
             ) {
            System.out.println(users);
        }
    }
}
