package club.osai.dao;

import club.osai.po.OrderExt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class OrderDaoTest {
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
    public void findOrderExtById() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(5L);
        List<OrderExt> orderExtById = mapper.findOrderExtById(orderExt);
        System.out.println(orderExtById);
        sqlSession.close();
    }
    @Test
    public void findOrderB() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(5L);
        List<OrderExt> orderExtById = mapper.findOrdersAndUserResultMap(orderExt);
        System.out.println(orderExtById);
        sqlSession.close();
    }
    @Test
    public void findOrderByIdLazyLoad() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(3L);
        List<OrderExt> orderExtById = mapper.findOrderByIdLazyLoad(3L);
        System.out.println(orderExtById);
        sqlSession.close();
    }   @Test
    public void findOrdersAndOrderDetail() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(3L);
        List<OrderExt> orderExtById = mapper.findOrdersAndOrderDetail(orderExt);
        System.out.println(orderExtById);
        sqlSession.close();
    }
}