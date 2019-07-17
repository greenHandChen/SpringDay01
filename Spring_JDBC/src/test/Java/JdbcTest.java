import SpringDay2.JDBC.Dao.UserDao;
import SpringDay2.JDBC.Dao.UserDaoSupport;
import SpringDay2.JDBC.Enity.User;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.security.AlgorithmConstraints;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: JDBC测试类
 * @Author: TanLinQuan
 * @Date: 2019/7/17 9:37
 * @Version: V1.0
 **/
public class JdbcTest {

    /**
     * @Description: 基于原生JDBC对数据库进行连接
     * @Author: TanLinQuan
     * @Date: 2019/7/17 10:20
     * @params: []
     * @return: void
     **/
    @Test
    public void ConnecteTest() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/spring_jdbc?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("LMR2667482");


        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_uer (username,password) values (? ,?);";
        jdbcTemplate.update(insertSql, "hikari", "123456");
    }

    /**
     * @Description: 基于Spring ioc容器及注解对数据库进行配置和连接
     * @Author: TanLinQuan
     * @Date: 2019/7/17 10:21
     * @params: []
     * @return: void
     **/
    @Test
    public void XmlConnecTion() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
//        User user = new User();
//        user.setId(3L);
//        user.setUsername("mybatis");
//        user.setPassword("123456");
//        userDao.update(user);
        userDao.delete(3L);
    }

    /**
     * @Description: 通过对Dao类继承JDBCDaoSupport去操作sql
     * @Author: TanLinQuan
     * @Date: 2019/7/17 11:08
     * @params: []
     * @return: void
     **/
    @Test
    public void JDBCSupport() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoSupport userDaoSupport = (UserDaoSupport) context.getBean("userDaoSupport");
        User user = new User();
        user.setId(6L);
        user.setUsername("Mapper-plus");
        user.setPassword("2667482");
//        if (userDaoSupport.insert(user) == 1) {
//            System.out.println("插入成功");
//        } else {
//            System.out.println("插入失败");
//       }
//        if (userDaoSupport.update(user) == 1) {
//            System.out.println("更新成功");
//        } else {
//            System.out.println("更新失败");
//        }
//        if (userDaoSupport.delete(user.getId()) == 1) {
//            System.out.println("删除成功");
//        } else {
//            System.out.println("删除失败");
//        }
    }

    /**
    * @Description: 通过JDBCDaoSupport去进行查询操作
    * @Author: TanLinQuan
    * @Date: 2019/7/17 11:55
    * @params: []
    * @return: void
    **/
    @Test
    public void selectUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoSupport userDaoSupport = (UserDaoSupport) context.getBean("userDaoSupport");
        User user = new User();
        user.setId(1L);
        System.out.println(userDaoSupport.getUserById(user).getId());
        List<User> users = new LinkedList<User>();
        users = userDaoSupport.getUser();
        for (User user1 : users) {
            System.out.println(user1.getId());
            System.out.println(user1.getUsername());
            System.out.println(user1.getPassword());
        }

    }
}
