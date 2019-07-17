package zbh.handspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zbh.handspring.dao.UserDao;
import zbh.handspring.pojo.User;

import java.util.List;

/**
 * @author: wuhui
 * @time: 2019/7/17 9:20
 * @desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {
    @Autowired
    JdbcTemplate template;

    @Autowired
    UserDao dao;

    @Test
    public void testSelect(){
        System.out.println(dao.getUserById(1));
    }
    @Test
    public void testSelectList(){
        Integer[] ids={1,2};
        List<User> users=dao.getUserByIds(ids);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.toString());
        }
    }

    @Test
    public void testadd(){
        String sql="insert into sys_user (username,password) values('2','2')";
        template.update(sql);
    }
    @Test
    public void testadd2(){
        String sql="insert into sys_user values(null,?,?)";
        template.update(sql,"25510","hand");
    }
    @Test
    public void testupdate(){
        String sql="update sys_user set username='hahah' where id=1";
        template.update(sql);
    }
    @Test
    public void testupdate2(){
        String sql="update sys_user set username=? where id=?";
        template.update(sql,"zbh",5);
    }
    @Test
    public void testupdelete(){
        String sql="delete from sys_user  where id >3";
        template.update(sql);
    }
    @Test
    public void testupdelete2(){
        String sql="delete from sys_user  where id >?";
        template.update(sql,3);
    }
}
