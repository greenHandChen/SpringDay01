import com.spring.druid.UserDao2;
import com.spring.hikari.User;
import com.spring.hikari.UserDao;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Dotest {
    @Test
    public void testJdbc(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?userUnicode=true&characterEcoding=utf-8&userSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("root");
        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String sql="Insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(sql,"hikari","123456");
    }
    @Test
    public void testHikari(){
        ApplicationContext appCon =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=appCon.getBean("userDao", UserDao.class);
        User user=new User();
        user.setId(1);
        user.setUsername("新名字");
        user.setPassword("新密码");
        userDao.update(user);
    }
    @Test
    public void testDruid(){
        ApplicationContext appCon =new ClassPathXmlApplicationContext("applicationContextdruid.xml");
        UserDao userDao=appCon.getBean("userDao", UserDao.class);
        User user=new User();
        user.setId(1);
        userDao.delete(user);
    }
    @Test
    public void testJdbcDaoSupport(){
        ApplicationContext appCon =new ClassPathXmlApplicationContext("jdbcDaoSupport.xml");
        UserDao2 userDao2=appCon.getBean("userDao2", UserDao2.class);
        User user=new User();
        user.setId(1);
        user.setUsername("新名字");
        user.setPassword("新密码");
        userDao2.update(user);
        //userDao2.delete(user);
    }
    @Test
    public void testSelect(){
        ApplicationContext appCon =new ClassPathXmlApplicationContext("jdbcDaoSupport.xml");
        UserDao2 userDao2=appCon.getBean("userDao2", UserDao2.class);
        com.spring.druid.User u= new com.spring.druid.User();
        u.setId(1);
        com.spring.druid.User user=userDao2.getUserById(u);
        System.out.println(user);
        System.out.println("=======================");
        List< com.spring.druid.User> users=userDao2.getUsers();
        for(int i = 0;i < users.size();i++){
            System.out.print(users.get(i)+" , ");
        }
    }
}
