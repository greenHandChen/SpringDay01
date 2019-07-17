package SimpleDatabaseQuery;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {
    @Test
    public void test(){  //添加数据
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/springdemo?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);

        String insertSql = "insert into sys_user(username,password) values(?,?);";
        int flag = jdbcTemplate.update(insertSql,"hikari","123456");
        if(flag>=1){
            System.out.println("插入数据成功");
        }
    }

    @Test
    public void run_with_HikariDataSource(){  //更新数据
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IDEA\\demo\\src\\main\\resources\\applicationContext.xml");
         // 为什么在这里传入的参数是自定义的 HikariDataSourceTest 类？？/
        HikariDataSourceTest hikariDataSourceTest = applicationContext.getBean("hikariDataSourceTest",HikariDataSourceTest.class);
        User user = new User();
        user.setId(6);
        user.setUsername("李四");
        user.setPassword("lisi");
        int i= hikariDataSourceTest.updata(user);
        if(i>=1){
            System.out.println("修改数据成功");
        }
    }

    @Test
    public void delById(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IDEA\\demo\\src\\main\\resources\\applicationContext.xml");
        HikariDataSourceTest hikariDataSourceTest = applicationContext.getBean("hikariDataSourceTest",HikariDataSourceTest.class);
        int i = hikariDataSourceTest.deleteByID(6);
        if(i>=0){
            System.out.println("删除数据成功");
        }
    }


}
