import com.hand.bean.User;
import com.hand.dao.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class oldDaoTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    @Test
    public void testDao() throws IOException {
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(12));
        System.out.println(userDao.findByUsername("'张三'"));
        User user=new User();
        user.setUsername("汉得");
        user.setAddress("上海");
        System.out.println(userDao.insertInfo(user));
    }
}
