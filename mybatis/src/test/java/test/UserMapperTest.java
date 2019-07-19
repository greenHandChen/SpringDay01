package test;

import com.hand.entity.User;
import com.hand.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by HuangHeng on 2019/7/19
 */
public class UserMapperTest {
    private SqlSession sqlSession =null;
    private SqlSessionFactory sqlSessionFactory=null;

    @Before
    public void before() throws IOException {
        String resource = "mybatisConfig.xml";
        InputStream inputStream
                = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession= sqlSessionFactory.openSession();
    }
    @Test
    public void findUserById(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println("user-------->"+user);

//      执行commit操作，将一级缓存清空
//      mapper.insertUser(user);
//      sqlSession.commit();

        User user1 = mapper.findUserById(1);
        System.out.println("user-------->"+user1);
        sqlSession.close();
    }
    @Test
    public void testTwoLevelCache(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper mapper3 = sqlSession3.getMapper(UserMapper.class);

        User user1 = mapper1.findUserById(1);
        User user23 = mapper2.findUserById(1);
        User user3 = mapper3.findUserById(1);

        sqlSession1.close();
        sqlSession2.close();
        sqlSession3.close();
    }
}
