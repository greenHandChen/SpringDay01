package mybatistest;

import com.mybatis.dao.UserDao;
import com.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class mybatiscache {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testFirstCacheDemo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.findUserById(27);
        mapper.findUserById(27);
        sqlSession.close();
    }
    @Test
    public void testFirstCacheDemo2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.findUserById(27);
        User user=new User();
        user.setUsername("清空sqlSession级（一级）缓存");
        mapper.addUser(user);
        mapper.findUserById(27);
        sqlSession.close();
    }
    @Test
    public void testSecondCacheDemo2(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        UserDao mapper1 = sqlSession1.getMapper(UserDao.class);
        UserDao mapper2 = sqlSession2.getMapper(UserDao.class);
        UserDao mapper3 = sqlSession3.getMapper(UserDao.class);
        mapper1.findUserById(27);
        sqlSession1.close();
        User user=new User();
        user.setUsername("清空sqlSessionFactory级（二级）缓存");
        mapper3.addUser(user);
        sqlSession3.commit();
        sqlSession3.close();
        mapper2.findUserById(27);
        sqlSession2.close();
    }
}
