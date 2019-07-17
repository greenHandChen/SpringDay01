package QueryTable;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TestJDBC {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HikariDataSourceTest hikariDataSourceTest = applicationContext.getBean("hikariDataSourceTest",HikariDataSourceTest.class);
        List<User> ls = hikariDataSourceTest.getUserByNone();
        for(int i =0;i<ls.size();i++){
            System.out.print(ls.get(i).getId()+" ");
            System.out.print(ls.get(i).getUsername()+" ");
            System.out.print(ls.get(i).getPassword());
            System.out.println();
        }
        System.out.println("***************一条分界线而已***************");
        User user = new User();
        user.setId(8L);
        User user1 = hikariDataSourceTest.getUser(user);
        System.out.print(user1.getId());
        System.out.print(user1.getUsername());
        System.out.print(user1.getPassword());
    }

}
