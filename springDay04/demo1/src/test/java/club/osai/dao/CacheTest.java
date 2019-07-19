package club.osai.dao;

import club.osai.po.OrderExt;
import club.osai.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: CacheTest.java
 * @Version: 1.0
 * @Date: 2019/7/19
 * @Description:
 */

public class CacheTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        //读取配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("config/mybatis-config.xml");
            //初始化mybatis，创建SqlSessionFactory类实例
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test() {
        /*
        两次查询,只有第一次走数据库，第二次从缓存中读取

         */

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(3L);
        List<OrderExt> orderExtById = mapper.findOrderExtById(orderExt);
        List<OrderExt> orderExtById1 = mapper.findOrderExtById(orderExt);
        System.out.println(orderExtById);
        System.out.println(orderExtById1);
        sqlSession.close();

    }

    @Test
    public void test1() {
        /*
        两次查询,中间新增了用户,将会清空SqlSesiion只有第一次走数据库，第二次从缓存中读取

         */
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User userById = mapper.findUserById(1L);
        System.out.println(userById);

        System.out.println("-----------添加用户--------------");
        User user = new User();
        user.setUsername("缓存测试用户");
        mapper.addUser(user);
        sqlSession.commit();
        userById = mapper.findUserById(1L);
        System.out.println(userById);
        sqlSession.close();
    }

    @Test
    public void test2() {
        /*
       由于二级缓存是mapper级别，是跨sqlSession,所以需要创建多个sqlSession进行测试，第一个sqlSession关闭后,第二个sqlSession仍不走数据库查询。
        Cache Hit Radio :缓存命中率
        第一次缓存中没有记录，则命中率0.0；
        第二次缓存中有记录，则命中率0.5（访问两次，有一次命中）


         */
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        SqlSession sqlSession4 = sqlSessionFactory.openSession();
        UserDao mapper1 = sqlSession1.getMapper(UserDao.class);
        UserDao mapper2 = sqlSession2.getMapper(UserDao.class);
        UserDao mapper3 = sqlSession3.getMapper(UserDao.class);
        UserDao mapper4 = sqlSession4.getMapper(UserDao.class);

        User userById = mapper1.findUserById(1L);
        sqlSession1.close();

        userById = mapper2.findUserById(1L);
        sqlSession2.close();



        userById = mapper3.findUserById(1L);
        sqlSession3.close();

        System.out.println(userById);
        userById = mapper4.findUserById(1L);
        System.out.println(userById);


    }

    @Test
    public void test3() {
        /*
       先是查询用户，再插入用户commit之后清除二级缓存，再次查询又走了数据库。

         */
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        SqlSession sqlSession4 = sqlSessionFactory.openSession();
        UserDao mapper1 = sqlSession1.getMapper(UserDao.class);
        UserDao mapper2 = sqlSession2.getMapper(UserDao.class);
        UserDao mapper3 = sqlSession3.getMapper(UserDao.class);
        UserDao mapper4 = sqlSession4.getMapper(UserDao.class);

        User userById = mapper1.findUserById(1L);
        sqlSession1.close();




        User user = new User();
        user.setUsername("二级缓存测试用户");
        mapper2.addUser(user);
        sqlSession2.commit();

        userById = mapper2.findUserById(1L);
        sqlSession2.close();


        userById = mapper3.findUserById(1L);
        sqlSession3.close();

        System.out.println(userById);
        userById = mapper4.findUserById(1L);
        System.out.println(userById);
        sqlSession4.close();


    }

}
