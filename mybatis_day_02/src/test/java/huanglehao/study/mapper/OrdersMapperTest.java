package huanglehao.study.mapper;

import huanglehao.study.po.Orders;
import huanglehao.study.po.OrdersExt;
import huanglehao.study.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 9:32 2019/7/19
 */
public class OrdersMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        //读取配置文件
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void findOrderAndUser() {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list=ordersMapper.findOrderAndUser();
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void findOrderAndUserRstMap() {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list=ordersMapper.findOrderAndUserRstMap();
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void findOrderAndDetailesRstMap() {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list=ordersMapper.findOrderAndDetailesRstMap();
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findUserAndItemsRstMap() {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<User> list=ordersMapper.findUserAndItemsRstMap();
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void findOrderAndUserLazyLoading() {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list=ordersMapper.findOrderAndUserLazyLoading();
       // System.out.println(list);,会触发立即加载
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testOneLevelCache() throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        //第一次查询
        User user1=mapper.findUserById(1);
        System.out.println(user1);

        mapper.insertUser(user1);
        sqlSession.commit();

        //第二次查询
        User user2=mapper.findUserById(1);
        System.out.println(user2);
    }

    @Test
    public void testTwoLevelCache() throws Exception{
        SqlSession sqlSession1=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        SqlSession sqlSession3=sqlSessionFactory.openSession();

        UserMapper mapper1=sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2=sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper3=sqlSession1.getMapper(UserMapper.class);

        //第一次查询
        User user1 = mapper1.findUserById(1);
        System.out.println(user1);
        sqlSession1.close();
        //在close才会将数据写入二级缓存中
        User user2 = mapper2.findUserById(1);
        System.out.println(user1);



        sqlSession2.close();
        sqlSession3.close();
    }
}