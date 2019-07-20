
import daoMapper.OrdersDao;
import domain.OrdersExt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrdersTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init()throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void t1(){
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrdersDao ordersDao=sqlSession.getMapper(OrdersDao.class);

        OrdersExt ordersExt=new OrdersExt();

        ordersExt.setId(3);

        List<OrdersExt> list=ordersDao.findOrdersByOrderExt(ordersExt);

        for(OrdersExt ordersExts: list){
            System.out.println(ordersExts.getUser().getUsername());
        }

        sqlSession.close();


    }

    @Test
    public void t2(){
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrdersDao ordersDao=sqlSession.getMapper(OrdersDao.class);

        OrdersExt ordersExt=new OrdersExt();

        ordersExt.setId(3);

        List<OrdersExt> list=ordersDao.findOrdersByResultMap(ordersExt);

        for(OrdersExt ordersExts: list){
            System.out.println(ordersExts.getUser().getUsername());
        }

        sqlSession.close();


    }

    @Test
    public void t3(){
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrdersDao ordersDao=sqlSession.getMapper(OrdersDao.class);

        OrdersExt ordersExt=new OrdersExt();

        ordersExt.setId(3);

        List<OrdersExt> list=ordersDao.findOrdersAndOrdersDetail(ordersExt);

        for(OrdersExt ordersExts: list){
            System.out.println(ordersExts.getUser().getUsername());
        }

        sqlSession.close();


    }



    /**
     * @Description 多对多的测试
     * @Author  ChenWeixong
     * @Date   2019/7/19 14:41
     * @Param
     * @Return
     * @Exception
     * */

    @Test
    public void t4(){
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrdersDao ordersDao=sqlSession.getMapper(OrdersDao.class);

        OrdersExt ordersExt=new OrdersExt();

        ordersExt.setId(3);

        List<OrdersExt> list=ordersDao.listOrders(ordersExt);

        for(OrdersExt ordersExts: list){
            System.out.println(ordersExts.getUser().getUsername());
        }

        sqlSession.close();

    }

    @Test
    public void t5(){
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrdersDao ordersDao=sqlSession.getMapper(OrdersDao.class);

        OrdersExt ordersExt=new OrdersExt();

        ordersExt.setId(3);

        List<OrdersExt> list=ordersDao.findOrdersInfoByLazyLoad(ordersExt.getId());

        for(OrdersExt ordersExts: list){
            System.out.println(ordersExts.getUser().getUsername());
        }

        sqlSession.close();

    }
}
