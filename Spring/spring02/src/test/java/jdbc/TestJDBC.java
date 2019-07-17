package jdbc;

import com.lzn.spring.jdbc.SysUser;
import com.lzn.spring.jdbc.UserDao;
import com.lzn.spring.jdbcDaoSupport.UserDaoSup;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;


public class TestJDBC {

    /**
     * @Description 采用Hikari数据源,同时不采用spring的XML配置方式来插入数据
     * @Author LinZhenNan
     * @Date 2019/7/17
     * @Time 16:49
     */
    @Test
    public void testApi() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("hehe");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username, password) values(?, ?)";
        jdbcTemplate.update(insertSql, "hikari", "654321");

        System.out.println("testApi() end");
    }

    /**
     * @Description 通过注解的方式定义bean,以及注入依赖来修改数据
     * @Param 
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/17
     * @Time 17:20
     */
    @Test
    public void demo01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dataSourceBeans.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao", UserDao.class);
        SysUser sysUser = new SysUser();
        sysUser.setId(new Integer(3));
        sysUser.setUsername("hehe");
        sysUser.setPassword("pwd");
        userDao.update(sysUser);

        System.out.println("demo01() end");
    }

    /**
     * @Description <context:property-placeholder>加载外部配置文件来修改数据
     * @Param
     * @Return
     * @Author LinZhenNan
     * @Date 2019/7/17
     * @Time 18:57
     */
    @Test
    public void demo02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao", UserDao.class);
        SysUser sysUser = new SysUser();
        sysUser.setId(new Integer(3));
        sysUser.setUsername("hehe");
        sysUser.setPassword("pwd");
        userDao.update(sysUser);

        System.out.println("demo02() end");
    }


    /**
     * @Description 不需要再配置jdbcTemplate的bean，在UserDao中去继承JdbcDaoSupport,同时注入数据源
     * @Param 
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/17
     * @Time 20:06
     */
    @Test
    public void demo03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("supportJdbc.xml");
        UserDaoSup userDao = (UserDaoSup) applicationContext.getBean("userDaoSup", UserDaoSup.class);
        SysUser sysUser = new SysUser();
        sysUser.setId(new Integer(3));
        sysUser.setUsername("hehe");
        sysUser.setPassword("demo03");
        userDao.update(sysUser);

        System.out.println("demo03() end");
    }

    /**
     * @Description 实现RowMapper接口
     * @Param 
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/17
     * @Time 20:20
     */
    @Test
    public void demo04() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("supportJdbc.xml");
        UserDaoSup userDao = (UserDaoSup) applicationContext.getBean("userDaoSup", UserDaoSup.class);
        SysUser sysUser = new SysUser();
        sysUser.setId(new Integer(3));
        sysUser = userDao.getUserById(sysUser);
        System.out.println(sysUser.toString());

        List<SysUser> list = userDao.getUsers();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("demo04() end");
    }
}
