import com.hand.wqw.bean.User;
import com.hand.wqw.dao.UserDao;
import com.hand.wqw.dao.UserDaoSupport;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestAPI {

    /**
     * HikariDataSource测试
     */
    @Test
    public void test(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&useSSL=false&zeroDateTimeBehavior=convertToNull");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("0097214214AB");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String sql = "update sys_user set password = ? where id = 1";
        jdbcTemplate.update(sql, "123456");

    }

    /**
     * xm;配置jdbcTemplate测试
     */
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "update sys_user set password = ? where id = 1";
        System.out.println(jdbcTemplate.update(sql, "123456"));
    }

    /**
     * dao扫描测试
     */
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User u = new User();
        u.setId(3);
        u.setUsername("张三");
        u.setPassword("zhangsan");
        System.out.println(userDao.update(u));
    }

    /**
     * properties测试
     */
    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User u = new User();
        u.setId(4);
        u.setUsername("李四");
        u.setPassword("lisi");
        System.out.println(userDao.update(u));
    }

    /**
     * JdbcDaoSupport测试
     */
    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoSupport userDao = applicationContext.getBean("userDaoSupport", UserDaoSupport.class);
        System.out.println("用户数："+userDao.selectCount());
        System.out.println("用户名："+userDao.selectUserName(3));
        System.out.println(userDao.seelctUser(4));
        System.out.println(userDao.selectUsers());
    }
}
