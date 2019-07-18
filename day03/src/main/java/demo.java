import lq.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class demo {
    @Test
    public void test1() throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",1);
        System.out.println(user.toString());
        sqlSession.close();
    }
    @Test
    public void test2() throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserByUsername","'%明%'or 1=1");
        System.out.println(user.toString());
        sqlSession.close();
    }
    @Test
    public void test3() throws IOException {
       InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setAddress("shanghai");
        user.setUsername("汉得");
        int i=sqlSession.insert("test.insertUser",user);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test4() throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setAddress("shangADSADhai");
        user.setUsername("汉DSFSF得");
        int i=sqlSession.insert("test.insertUserGetId",user);

        System.out.println(i+"sad"+user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

}
