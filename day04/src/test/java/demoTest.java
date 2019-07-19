
import com.hand.wqw.dao.OrdersDao;
import com.hand.wqw.dao.UserDao;
import com.hand.wqw.dao.daoimpl.UserDaoImpl;
import com.hand.wqw.domain.User;
import com.hand.wqw.vo.OrderExt;
import com.hand.wqw.vo.UserOrderVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;


public class demoTest {

    private ApplicationContext applicationContext;
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before(){
        applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        sqlSessionFactory = applicationContext.getBean("sqlSessionFactory",SqlSessionFactory.class);
    }

    /**
     * 一对一测试
     * @throws IOException
     */
    @Test
    public void findOrderExt(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersDao orderDao = sqlSession.getMapper(OrdersDao.class);
        OrderExt o = new OrderExt();
        o.setId(3);
        List<OrderExt> orderExts = orderDao.findOrderExts(o);
        System.out.println("-----动态代理-----");
        System.out.println(orderExts);
        OrdersDao orderDaoImpl = applicationContext.getBean("ordersDaoImpl", OrdersDao.class);
        List<OrderExt> objects = orderDaoImpl.findOrderExts(o);
        System.out.println("-----接口实现类-----");
        System.out.println(objects);
    }

    /**
     * 一对多测试
     * @throws IOException
     */
    @Test
    public void test2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        UserOrderVo userOrders = userDao.findUserOrders(1);
        System.out.println("-----动态代理-----");
        System.out.println(userOrders);
        UserDao userDaoImpl = applicationContext.getBean("userDaoImpl",UserDao.class);
        UserOrderVo userOrders1 = userDaoImpl.findUserOrders(1);
        System.out.println("-----接口实现类-----");
        System.out.println(userOrders1);
    }

    /**
     * 懒加载测试
     */
    @Test
    public void test3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersDao orderDao = sqlSession.getMapper(OrdersDao.class);
        OrderExt orderExtsLazyLoad = orderDao.findOrderExtsLazyLoad(3);
        System.out.println("-----动态代理-----");
        System.out.println(orderExtsLazyLoad);
        OrdersDao orderDaoImpl = applicationContext.getBean("ordersDaoImpl", OrdersDao.class);
        OrderExt orderExtsLazyLoad1 = orderDaoImpl.findOrderExtsLazyLoad(3);
        System.out.println("-----接口实现类-----");
        System.out.println(orderExtsLazyLoad1);
    }

    /**
     * 二级缓存测试1
     */
    @Test
    public void test4(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.selectUserById(1);
        User user1 = userDao.selectUserById(1);
        System.out.println(user);
        System.out.println(user1);
    }

    /**
     * 二级缓存测试2
     */
    @Test
    public void test5(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.selectUserById(1);
        User u = new User();
        u.setAddress("芜湖");
        u.setBirthday(new Timestamp(30000));
        u.setUsername("saadgrfg");
        u.setSex(1);
        userDao.insertUser(u);
        User user1 = userDao.selectUserById(1);
        System.out.println(user);
        System.out.println(user1);
    }

}
