package huanglehao.study;


import com.zaxxer.hikari.HikariDataSource;
import huanglehao.study.Entity.User;
import huanglehao.study.Repository.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

    @org.junit.Test
    public void testApi(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"hikari","123456");
    }

    @org.junit.Test
    public void testHikariCP(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();
        user.setId(1);
        user.setUsername("2019/07/17");
        user.setPassword("10:12");
        userDao.update(user);
    }

    @org.junit.Test
    public void testDruid(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();
        user.setId(2);
        user.setUsername("2019/07/17");
        user.setPassword("10:17");
        userDao.update(user);
    }
    @org.junit.Test
    public void testInsert(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
       userDao.insert();
    }
    @org.junit.Test
    public void testDelete(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        userDao.delete();
    }

}
