import day04_cache.domain.User;
import day04_cache.domain.ext.OrdersExt3;
import day04_cache.mapper.OrdersExt3Mapper;
import day04_cache.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public class CacheTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void test01(){
        User user = new User();
        user.setId(1);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = mapper.findUserById(user);

        //修改user
        user.setUsername("王杰");
        user.setAddress("地址");
        user.setBirthday(new Date());
        user.setSex(5);
        mapper.addUser(user);

        mapper.findUserById(user);


        sqlSession.close();
    }

    @Test
    // 测试二级缓存
    public void test02(){
        User user = new User();
        user.setId(1);

        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper mapper3 = sqlSession3.getMapper(UserMapper.class);

        mapper1.findUserById(user);
        sqlSession1.close();

        mapper2.findUserById(user);
        sqlSession2.close();

    }

    @Test
    // 测试二级缓存
    public void test03(){
        User user = new User();
        user.setId(1);

        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper mapper3 = sqlSession3.getMapper(UserMapper.class);

        mapper1.findUserById(user);
        sqlSession1.close();
        //
        user.setUsername("王杰");
        user.setAddress("地址");
        user.setBirthday(new Date());
        user.setSex(5);
        mapper2.addUser(user);
        //
        mapper2.findUserById(user);
        sqlSession2.close();

    }
}
