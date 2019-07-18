import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BatisTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder() .build(is);

    }
    @Test
    public void testDemo1() throws IOException {
        //
        SqlSession sqlSession=sqlSessionFactory .openSession();
        User user=sqlSession.selectOne("findById",1);
        System.out.println(user);
        sqlSession.close();
    }
   @Test
    public void testDemo2() throws IOException {
        SqlSession sqlSession=sqlSessionFactory .openSession();
        List<User> user=sqlSession.selectList("findByName","'%明%' OR 1=1");
        //System.out.println(释放连接);
       sqlSession.close();
    }
    @Test
    public void testDemo3() throws IOException {
        SqlSession sqlSession=sqlSessionFactory .openSession();
        User user =new User();
        user.setUserName("小胡");
        user.setAddress("蔡王");
        int val=sqlSession.insert("addUser",user);
        System.out.println(val);
        sqlSession.commit();
        sqlSession.close();
    }
/*添加用户返回自增主键*/
    @Test
    public void testDemo4() throws IOException {
        SqlSession sqlSession=sqlSessionFactory .openSession();
        User user=new User();
        user.setUserName("大学");
        user.setAddress("安徽");
        sqlSession.insert("addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
    /*添加用户返回UUID主键*/
    @Test
    public void testDemo5() throws IOException {
        SqlSession sqlSession=sqlSessionFactory .openSession();
        User user=new User();
        user.setUserName("耳机");
        user.setAddress("动铁");
        sqlSession.insert("addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

}


