import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public  void t1() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessinFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessinFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public  void t2() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessinFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessinFactory.openSession();
        List<User> users=sqlSession.selectList("test.findUserByUsername"," '%明%' or 1=1");
        System.out.println(users);
        sqlSession.close();

    }

    @Test
    public  void t3() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessinFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessinFactory.openSession();
       User user=new User();
       user.setUsername("汉得");
       user.setAddress("上海");
       int val=sqlSession.insert("test.addUser",user);
        System.out.println(val);
        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public  void t4() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessinFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessinFactory.openSession();
        User user=new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        int val=sqlSession.insert("test.addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();

    }


}
