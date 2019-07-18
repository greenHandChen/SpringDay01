import com.lzn.mybatis.entity.TestUserEntity;
import com.lzn.mybatis.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


//@RunWith(value = SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:/config/**/applicationContext*.xml" }, loader = GenericXmlContextLoader.class)
public class Demo {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception{
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/SqlMapConfig.xml"));

    }



    /**
     * @Description 根据用户 ID查询用户信息
     * @Param
     * @Return
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 14:28
     */
    @Test
    public void demo01() throws IOException {
        // 读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        // 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 执行查询，第一个参数是命名空间，sql的 ID，第二个参数是查询的参数
        UserEntity user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);

        // 关闭 sqlSession(释放连接)
        sqlSession.close();

        System.out.println("demo01() end");
    }

    /**
     * @Description 根据用户名模糊查询用户信息
     * @Param
     * @Return
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 14:43
     */
    @Test
    public void demo02() {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        List<UserEntity> users = sqlSession.selectList("test.findUserByUsername", "'%明%'");
        System.out.println(users);
        sqlSession.close();

        System.out.println("demo02() end");
    }


    /**
     * @Description 添加用户
     * @Param
     * @Return
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 15:03
     */
    @Test
    public void demo03() {
        UserEntity user = new UserEntity();
        user.setUsername("hehe");
        user.setAddress("犄角旮旯");
        user.setBirthday(new Date());
        user.setSex(new Integer(1));
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        int rows = sqlSession.insert("test.addUser", user);
        System.out.println(rows + " lines is affected");
        System.out.println(user);

        // 提交事务
        sqlSession.commit();
        sqlSession.close();

        System.out.println("demo03() end");
    }

    /**
     * @Description 添加用户并返回自增主键(mysql)
     * @Param 
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 15:34
     */
    @Test
    public void demo04() {
        UserEntity user = new UserEntity();
        user.setUsername("hehe");
        user.setAddress("test of addUserGetId");
        user.setBirthday(new Date());
        user.setSex(new Integer(1));
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        int rows = sqlSession.insert("test.addUserGetId", user);
        System.out.println(rows + " lines is affected");
        System.out.println(user);

        // 提交事务
        sqlSession.commit();
        sqlSession.close();

        System.out.println("demo04() end");
    }

    /**
     * @Description 添加用户返回UUID(新建表测试)
     * @Param 
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 15:36
     */
    /*表语句 mysql
    create table test_user(
            id varchar(36) primary key,
            username varchar(32),
            birthday date, sex char(1),
            address varchar(255))*/
    @Test
    public void demo05() {
        TestUserEntity user = new TestUserEntity();
        user.setUsername("hehe");
        user.setAddress("test of addUserGetUUID");
        user.setBirthday(new Date());
        user.setSex(new Integer(1));
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        int rows = sqlSession.insert("test.addUserGetUUID", user);
        System.out.println(rows + " lines is affected");
        System.out.println(user);

        // 提交事务
        sqlSession.commit();
        sqlSession.close();

        System.out.println("demo05() end");
    }







    private void setSqlSessionFactory(String Resource) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(Resource);
        this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
}
