import com.mybatis.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class testmybatis {
    @Test
    public void demo1() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession =sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void demo2() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession =sqlSessionFactory.openSession();
        List<User> users=sqlSession.selectList("test.findUserByUsername","'%明%' or 1=1");
        System.out.println(users);
        sqlSession.close();
    }
    @Test
    public void demo3() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession =sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("李子杰");
        user.setAddress("上海");
        user.setBirthday(new GregorianCalendar(1997, 8, 5,0,0,0).getTime());
        int val=sqlSession.insert("test.addUser",user);
        System.out.println(val);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void demo4() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession =sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("lizijie");
        user.setAddress("武汉纺织大学");
        user.setBirthday(new GregorianCalendar(1997, 8, 5,0,0,0).getTime());
        sqlSession.insert("test.addUserGetId",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
