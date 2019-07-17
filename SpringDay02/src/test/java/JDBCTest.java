import Dao.UserDao;
import com.zaxxer.hikari.HikariDataSource;
import entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTest {
    @Test
    public void t1(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf8");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("root");

        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertSql,"hikari","123456");
    }

    @Test
    public void t2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);

        User user=new User();
        user.setId(1);
        user.setName("2019/07/09");
        user.setPassword("12345467");
//        userDao.update(user);
        System.out.println("user:"+userDao.getUserById(user));

        System.out.println("users:"+userDao.getUsers());

    }

}
