import com.sy.bean.User;
import com.sy.mapper.UserMapper;
import com.sy.mapper.orderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("config/ApplicationConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    /**
     * 一级缓存不提交测试
     */
    @Test
    public void testFirstCacheDemo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.findUserById(1);
        System.out.println("第一次查询mysql");
        User userById1 = mapper.findUserById(1);
        sqlSession.close();
    }

    /**
     * 一级缓存查询 提交测试
     */
    @Test
    public void testFirstCacheDemo2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.findUserById(1);
        System.out.println("第一次查询mysql");
        User user=new User();
        user.setUsername("wangxianjie");
        System.out.println(mapper.insertInfo(user));
        User userById1 = mapper.findUserById(1);
        sqlSession.close();
    }

    /**
     * 二级缓存查询
     */
    @Test
    public void testFirstCacheDemo3(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        orderMapper mapper1 = sqlSession1.getMapper(orderMapper.class);
        orderMapper mapper2 = sqlSession2.getMapper(orderMapper.class);
        orderMapper mapper3 = sqlSession3.getMapper(orderMapper.class);
        mapper1.findUserById(1);
        sqlSession1.close();
        mapper2.findUserById(1);
        sqlSession2.close();
        mapper3.findUserById(1);
        sqlSession3.close();

    }

    /**
     * 二级缓存只提交不进行操作不会清空二级缓存，只有进行增删改后提交才会清空
     */
    @Test
    public void testFirstCacheDemo4(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        orderMapper mapper1 = sqlSession1.getMapper(orderMapper.class);
        orderMapper mapper2 = sqlSession2.getMapper(orderMapper.class);
        orderMapper mapper3 = sqlSession3.getMapper(orderMapper.class);
        mapper1.findUserById(1);
        sqlSession1.commit();
        sqlSession1.close();
        mapper2.findUserById(1);
        sqlSession2.close();
        mapper3.findUserById(1);
        sqlSession3.close();

    }
}
