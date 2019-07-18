import damain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test1 {


    @Test
    public void demo01() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void demo02() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> users=sqlSession.selectList("test.findUserByUsername","'%明%'or 1=1" );
        System.out.println(users);
        sqlSession.close();
    }
    @Test
    public void demo03() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("汉得");
        user.setAddress("上海");
        int val=sqlSession.insert("test.addUser",user);
        System.out.println(val);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public  void  demo04() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        sqlSession.insert("test.addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();

    }
}
