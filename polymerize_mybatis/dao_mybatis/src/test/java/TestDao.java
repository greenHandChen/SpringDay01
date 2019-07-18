import com.zt.mybatis.dao.UserDaoImpl;
import com.zt.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-18 10:55
 */
public class TestDao {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        /**
         * @description: 初始化sqlSessionFactory
         * @author: invokerZt
         * @date: 2019-07-18 11:02
         * @param : 
         * @return: void
         */
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void test_01() {
        /**
         * @description: 根据id查询用户
         * @author: invokerZt
         * @date: 2019-07-18 11:13
         * @param :
         * @return: void
         */
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        User user = userDao.findUserById(28);
        System.out.println(user);
    }

    @Test
    public void test_02() {
        /**
         * @description: 添加用户
         * @author: invokerZt
         * @date: 2019-07-18 11:50
         * @param :
         * @return: void
         */
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        User user = new User();
        user.setUsername("老马");
        user.setAddress("成都");
        System.out.println(userDao.insertUser(user));
    }
}
