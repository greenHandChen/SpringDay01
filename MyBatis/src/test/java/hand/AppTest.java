package hand;

import static org.junit.Assert.assertTrue;

import Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void findByUserId() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("findUserId", 1);
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void demo2() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByUsername","小明");
        System.out.println(users.toString());
        sqlSession.close();
    }

    @Test
    public void demo3() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("汉得");
        user.setAddress("上海");
        int val = sqlSession.insert("test.addUser",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
}
