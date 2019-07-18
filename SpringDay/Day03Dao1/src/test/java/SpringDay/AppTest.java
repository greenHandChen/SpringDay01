package SpringDay;

import static org.junit.Assert.assertTrue;

import SpringDay.dao.impl.UserDaoImpl;
import SpringDay.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testDao(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);

        System.out.println(userDao.findUserById(31));

        System.out.println(userDao.findUserByUsername("汉"));

        User user = new User();
        user.setUsername("测试一下");
        user.setSex(5);
        user.setBirthday(new Date());
        user.setAddress("测试一下");

        System.out.println(userDao.addUser(user));
    }
}
