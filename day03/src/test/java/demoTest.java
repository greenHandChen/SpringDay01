import com.hand.wqw.domain.User;
import com.hand.wqw.mapper.UserMapper;
import com.hand.wqw.vo.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class demoTest {

    /**
     * 查询一个用户
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(10);
        System.out.println("------接口方式-----");
        System.out.println(user);
        System.out.println("------xml方式-----");
        User u = (User)sqlSession.selectOne("test.selectUserById", 1);
        System.out.println(u);
        sqlSession.close();
    }

    /**
     * 查询list
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUsersLikeUserName("'%小%'");
        System.out.println("------接口方式-----");
        System.out.println(users);
        System.out.println("------xml方式-----");
        List<User> us = sqlSession.selectList("test.selectUsersLikeUserName", "'%小%'");
        System.out.println(us);
        sqlSession.close();
    }

    /**
     * 插入并返回自增的主键
     * @throws IOException
     */
    @Test
    public void test3() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("test1");
        user.setBirthday(new Timestamp(200000));
        user.setSex(1);
        user.setAddress("汉得");
        int i = userMapper.insertUser(user);
        System.out.println("------接口方式-----");
        System.out.println("成功："+i+"条，id为："+user.getId());

        User u = new User();
        u.setUsername("test2");
        u.setBirthday(new Timestamp(200000));
        u.setSex(2);
        u.setAddress("汉得2");
        int insert = sqlSession.insert("test.insertUser", u);
        System.out.println("------xml方式-----");
        System.out.println("成功："+insert+"条，id为："+u.getId());
        sqlSession.commit();
        sqlSession.close();
    }


    /**
     * vo包装类测试
     * @throws IOException
     */
    @Test
    public void test4() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setSex(1);
        user.setAddress("%河南%");
        UserQueryVo userQueryVo = new UserQueryVo();
        userQueryVo.setUser(user);
        List<User> queryVo = userMapper.findByQueryVo(userQueryVo);
        System.out.println("------接口方式-----");
        System.out.println(queryVo);

        List<Object> objects = sqlSession.selectList("test.findByQueryVo", userQueryVo);
        System.out.println("------xml方式-----");
        System.out.println(objects);
        sqlSession.close();
    }

    /**
     * 测试ResultMap查询
     * @throws IOException
     */
    @Test
    public void test5() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUsernameAddressById(24);
        System.out.println("------接口方式-----");
        System.out.println(user);
        System.out.println("------xml方式-----");
        User u = (User)sqlSession.selectOne("test.findUsernameAddressById", 24);
        System.out.println(u);
        sqlSession.close();
    }

    /**
     * map查询测试
     * @throws IOException
     */
    @Test
    public void test6() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map map = new HashMap();
        map.put("username", "小");
        List<User> users = userMapper.findByMap(map);
        System.out.println("------接口方式-----");
        System.out.println(users);
        System.out.println("------xml方式-----");
        Object us = sqlSession.selectList("test.findByMap", map);
        System.out.println(us);
        sqlSession.close();
    }
}
