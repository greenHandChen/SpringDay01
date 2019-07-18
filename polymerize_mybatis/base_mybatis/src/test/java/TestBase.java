import com.zt.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestBase {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        // 1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    /**
     * @description:
     * @author: invokerZt
     * @date: 2019-07-18 10:21
     * @param :
     * @return: void
     */
    @Test
    public void test_01() {
        // 3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);
        sqlSession.close();
    }

    /**
     * @description:
     * @author: invokerZt
     * @date: 2019-07-18 10:21
     * @param :
     * @return: void
     */
    @Test
    public void test_02() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByUsername", "'%明%' OR 1=1");
        System.out.println(users);
        sqlSession.close();
    }

    /**
     * @description:
     * @author: invokerZt
     * @date: 2019-07-18 10:21
     * @param :
     * @return: void
     */
    @Test
    public void test_03() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("汉得");
        user.setAddress("上海");
        int rows = sqlSession.insert("test.addUser", user);
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * @description: 
     * @author: invokerZt
     * @date: 2019-07-18 10:32
     * @param null:
     * @return: 
     */
    @Test
    public void test_04() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("信息工程大学");
        user.setAddress("安徽");
        sqlSession.insert("test.addUserGetId", user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * @description: 添加用户返回UUID
     * @author: invokerZt
     * @date: 2019-07-18 10:26
     * @param null:
     * @return:
     */
    @Test
    public void test_05() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("机电学院");
        user.setAddress("芜湖");
        sqlSession.insert("test.addUserGetUUID", user);
        sqlSession.commit();
        sqlSession.close();
    }

}
