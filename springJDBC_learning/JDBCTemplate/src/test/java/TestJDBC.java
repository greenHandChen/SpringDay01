import com.hand.DAO.UserDAO;
import com.hand.entity.User;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {

    @Test
    public void test1(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("921129");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String interSql = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(interSql,"hikari","123456");
    }

    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserDAO userDAO = applicationContext.getBean("userDAO",UserDAO.class);
        User user = new User();
        user.setId(1);
        user.setUsername("翁振霖");
        user.setPassword("112233");
        userDAO.update(user);
    }
}
