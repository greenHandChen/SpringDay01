import JDBC.User;
import JDBC.UserDao;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {
    @Test
    public void testApi() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncodeing=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("benchu");

        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertSql,"XuBoSi","123456");
        /*
        String sql1 = "insert into customers values(null,?)";
        jdbcTemplate.update(sql1, "小丽");
        String sql2 = "update customers set name= ? where id =?";
        jdbcTemplate.update(sql2, "小明", 1);
        String sql3 = "delete from customers where id =?";
        jdbcTemplate.update(sql3, 1);*/
    }
    @Test
    public void demo1(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\SpringJDBCDemo\\src\\main\\java\\applicationContext.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();
        user.setId(3L);
        user.setUsername("XuBoSi123");
        user.setUserpwd("benchu123");
        userDao.update(user);

    }
    @Test
    public void demo2(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\SpringJDBCDemo\\src\\main\\java\\applicationContext.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        String countSql1 = "select count(*) from sys_user;";
        Integer c = userDao.getJdbcTemplate().queryForObject(countSql1, null, Integer.class);
        System.out.println(c);
        String countSql2 = "select username from sys_user u where u.id = ?";
        Object[] objects = {5L};
        String rst = userDao.getJdbcTemplate().queryForObject(countSql2, objects, String.class);
        System.out.println(rst);

    }

}
