package SpringDay;

import static org.junit.Assert.assertTrue;

import SpringDay.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void demo01() throws IOException {
        //1、读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4、执行查询
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);
        //5、关闭sqlSession
        sqlSession.close();;
    }

    @Test
    public void demo2() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> userList = sqlSession.selectList("test.findUserByUsername", "'%明%' OR 1=1");
        System.out.println(userList);

        sqlSession.close();;
    }

    @Test
    public void demo3() throws IOException {
        User user = new User();
        user.setUsername("汉得");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("上海");


        SqlSession sqlSession = init();
        int insert = sqlSession.insert("test.addUser", user);
        System.out.println(insert);
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void demo04() throws IOException {
        User user = new User();
        user.setUsername("汉得2");
        user.setBirthday(new Date());
        user.setSex(2);
        user.setAddress("上海2");
        SqlSession sqlSession = init();

        int insert = sqlSession.insert("test.addUserGetId", user);
        System.out.println(user.getId());

        sqlSession.commit();
        sqlSession.close();;
    }



    private SqlSession init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        return sqlSession;
    }
}
