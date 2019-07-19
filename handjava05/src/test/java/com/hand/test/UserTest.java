package com.hand.test;

import com.hand.sysmanager.dao.IUserDao;
import com.hand.sysmanager.entity.OrdersExt;
import com.hand.sysmanager.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/18 15:30
 */
public class UserTest {

    @Test
   public void testFindUserById() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setUserId(5L);
        List<OrdersExt> list = userDao.findOrdersExt(ordersExt);
        for(OrdersExt ordersExt1 :list)
            System.out.println(ordersExt1);
        //6.释放资源
        session.close();
        in.close();

    }
    @Test
    public void testFindOrdersByResultMap() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setUserId(5L);
        List<OrdersExt> list = userDao.findOrdersByResultMap(ordersExt);
        for(OrdersExt ordersExt1 :list)
            System.out.println(ordersExt1);
        //6.释放资源
        session.close();
        in.close();

    }

    @Test
    public void testFindOrdersAndOrderDetail() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setUserId(5L);
        List<OrdersExt> list = userDao.findOrdersAndOrderDetail(ordersExt);
        for(OrdersExt ordersExt1 :list)
            System.out.println(ordersExt1);
        //6.释放资源
        session.close();
        in.close();

    }



    @Test
    public void testFindOrderInfoByLazyLoad() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
       List<OrdersExt> ordersExtList = userDao.findOrderInfoByLazyLoad(4L);
        System.out.println(ordersExtList.size());
        //6.释放资源
        session.close();
        in.close();

    }
    @Test
    public void testOneCache() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<OrdersExt> ordersExtList1 = userDao.findOrderInfoByLazyLoad(4L);
        List<OrdersExt> ordersExtList2 = userDao.findOrderInfoByLazyLoad(4L);
        System.out.println(ordersExtList1.size());
        System.out.println(ordersExtList2.size());
        //6.释放资源
        session.close();
        in.close();

    }

    @Test
    public void testTwiceCache() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session1 = factory.openSession();
        SqlSession session2 = factory.openSession();
        SqlSession session3 = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao1 = session1.getMapper(IUserDao.class);
        IUserDao userDao2 = session2.getMapper(IUserDao.class);
        IUserDao userDao3 = session3.getMapper(IUserDao.class);

        User user1 = userDao1.findUserById(10L);
        session1.close();
        User user2 = userDao2.findUserById(10L);
        session2.close();
        User user3 = userDao3.findUserById(10L);
        session3.close();
        //5.使用代理对象执行方法

        //6.释放资源

        in.close();

    }


}
