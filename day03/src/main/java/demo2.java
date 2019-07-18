import lq.dao.UserMapper;
import lq.pojo.User;
import lq.pojo.User2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class demo2 {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init()throws IOException{
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
         sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void test5() throws IOException {

        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setAddress("shai");
        user.setUsername("汉qddD");
        int i=userMapper.insertUserGetId(user);
        System.out.println(i+"sad"+user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test6(){

        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

       User user=userMapper.findUserById(1);
        System.out.println(user.toString());
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test7(){

        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        User2 user=new User2();
        user.setSex(1);
        user.setAd("河南");
        List<User2> u=userMapper.testWhere(user);
        if(u==null)
        {
            System.out.println("没有结果");
        }
        else
        {
            System.out.println(u);
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
