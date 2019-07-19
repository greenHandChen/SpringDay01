package com.hand;

import com.hand.bean.OrdersExt;
import com.hand.bean.OrdersInfo;
import com.hand.dao.OrdersExtDao;
import com.hand.dao.impl.OrdersExtDaoImpl;
import com.hand.dao.impl.OrdersInfoDaoImpl;
import com.hand.dao.impl.UserDaoImpl;
import com.hand.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppTest
{

    ApplicationContext ctx;
    String ctxName = "applicationContext.xml";

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext(ctxName);
    }

    /**
     * 复杂查询
     */
    @Test
    public void testOrdersExt(){
        OrdersExtDao ordersExtDao = ctx.getBean("ordersExtDaoImpl", OrdersExtDaoImpl.class);
        List<OrdersExt> ordersExt = ordersExtDao.getOrdersExt(3);
        for(OrdersExt o : ordersExt)
        System.out.println(o);
    }

    /**
     * 延迟加载
     */
    @Test
    public void testOrdersInfo(){
        OrdersInfoDaoImpl ordersInfoDaoImpl = ctx.getBean("ordersInfoDaoImpl", OrdersInfoDaoImpl.class);
        /*一条查询*/
        OrdersInfo ordersInfoById = ordersInfoDaoImpl.getOrdersInfoById(3);
        /*两条查询*/
        //System.out.println(ordersInfoById);
    }

    /**
     * 一级缓存
     */
    @Test
    public void testItemsForLevelOne(){
        SqlSessionFactory sqlSessionFactory = ctx.getBean("sqlSessionFactory", SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.getUserById(10);
        mapper.getUserById(10);
        mapper.getUserById(10);
        mapper.getUserById(10);
    }

    /**
     * 二级缓存
     * 需：mybatis-config.xml开启二级缓存 + UserMapper.xml添加缓存标签
     */
    @Test
    public void testUserForLevelTwo(){
        UserDaoImpl userDaoImpl = ctx.getBean("userDaoImpl", UserDaoImpl.class);
        userDaoImpl.getUserById(10);
        userDaoImpl.getUserById(10);
        userDaoImpl.getUserById(10);
        userDaoImpl.getUserById(10);
    }

}
