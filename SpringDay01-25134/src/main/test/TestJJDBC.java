import com.demo.spring.HelloClass;
import com.zaxxer.hikari.HikariDataSource;
import daytwo.User;
import daytwo.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJJDBC {
    @Test
    public void testApi(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");
        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"kikari",123456);
    }
    @Test
    public void testUser() {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao= (UserDao)applicationContext.getBean("userDao");
        User user=new User();
        user.setId(1);
        user.setUsername("tao");
        user.setPassword("123456");
        userDao.update(user);
    }
    }
}
