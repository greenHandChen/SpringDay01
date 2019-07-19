import com.domain.User;
import com.mapper.UserMapper;
import org.apache.ibatis.cache.impl.PerpetualCache;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 9:47 2019/7/19
 * @Modified By:
 */
public class UserMapperTest {

    private SqlSession sqlSession;

    @Before
    public void testBefore() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("Mybatis/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
    }

    @After
    public void testAfter(){
        sqlSession.close();
    }

    @Test   //测试多对多关系查询
    public void testFindUserAndItemsResultMap() throws IOException {
        UserMapper orderMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList=orderMapper.findUserAndItemsResultMap();
        //lambda表达式,遍历list
        userList.forEach(user -> System.out.println(user));
    }

    //一级缓存是SqlSession级别的,默认是开启的
    @Test   //测试一级缓存
    public void testFirstCacheDemo1(){
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        userMapper.findUserById(1);

        //第二次查询,不执行sql,从缓存中读取
        userMapper.findUserById(1);
    }

    //执行查询之后进行了增删改方法,会清空一级缓存,避免脏读
    @Test   //测试一级缓存
    public void testFirstCacheDemo2(){
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        userMapper.findUserById(1);

        //执行更新操作
        User user=new User();
        user.setId(1);
        user.setAddress("芜湖");
        userMapper.updateUserById(user);

//        sqlSession.commit();

        //由于缓存清空,第二次查询,从数据库中读取.
        userMapper.findUserById(1);
        sqlSession.close();
    }
    @Test//测试二级缓存--
    // 1.需要在SqlMapConfig.xml中<setting>添加cacheEnabled为true
    // 2.需要在userMapper.xml中添加<cache/>表示开启二级缓存,以默认的PerpetualCache来缓存
    // 3,需要在User.java类中进行序列化Serializable(当内存空间不足时,将mapper存到服务器磁盘中)
    public void secondCacheDemo1() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("Mybatis/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession1=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        SqlSession sqlSession3=sqlSessionFactory.openSession();

        UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2=sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3=sqlSession3.getMapper(UserMapper.class);

        userMapper1.findUserById(1);
        sqlSession1.close();

        userMapper2.findUserById(1);
        sqlSession2.close();

        userMapper3.findUserById(1);
        sqlSession3.close();
    }

    @Test//测试二级缓存
    public void secondCacheDemo2() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("Mybatis/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession1=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        SqlSession sqlSession3=sqlSessionFactory.openSession();

        UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2=sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3=sqlSession3.getMapper(UserMapper.class);

        userMapper1.findUserById(1);
        sqlSession1.close();

        //执行更新操作
        User user=new User();
        user.setId(1);
        user.setAddress("芜湖");
        userMapper2.updateUserById(user);
        sqlSession2.close();


        userMapper3.findUserById(1);
        sqlSession3.close();
    }
}
