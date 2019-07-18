package hand;

import Dao.UserDaoImpl;
import Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class daoTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void demo1(){
        UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
        System.out.println(userDao.findUserByUserId(1));
        System.out.println(userDao.findUserByUsername("汉"));
        User user = new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        System.out.println(userDao.addUser(user));
    }
}
