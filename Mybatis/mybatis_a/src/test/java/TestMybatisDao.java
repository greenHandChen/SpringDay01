import Dao.UserDaoImpl;
import damain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatisDao {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        this.sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testDao()
    {
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(29));
        System.out.println(userDao.findUserByUsername("汉"));
        User user=new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        System.out.println(userDao.addUser(user));
    }
}
