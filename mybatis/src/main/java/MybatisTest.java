import Domin.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MybatisTest {


    @Test
    public void demo01() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("test.findUserById",1);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void demo2() throws IOException, ParseException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("汉得");
        user.setAddress("上海");
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1902-3-4"));
        user.setSex(1);
        int val = sqlSession.insert("test.addUser",user);

        System.out.println(val);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void demo3() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("安信工");
        user.setAddress("安徽");
        sqlSession.insert("test.addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void demo4() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("安信工");
        user.setAddress("安徽");
        sqlSession.insert("test.addUserGetUUID",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
}
