import Dao.OrdersMapper;
import Dao.UserMapper;
import Vo.OrdersVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//使用接口与映射文件的方式
public class TestMybatisMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init()throws IOException{
//        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
//
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);


    }

    @Test
    public void testDao(){

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById("27"));
        sqlSession.close();
    }

    //对高级结果封装使用ResultType映射
    @Test
    public void testfindOrdersVo(){
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        OrdersVo ordersVo = new OrdersVo();
        ordersVo.setId(5);

        List<OrdersVo> ordersVos = ordersMapper.findOrderVo(ordersVo);
        sqlSession.close();
    }
    @Test
    public void testfindPrderVoMap(){
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        OrdersVo ordersVo = new OrdersVo();
        ordersVo.setId(5);

        List<OrdersVo> ordersVos = ordersMapper.findorderVoMap(ordersVo);
        sqlSession.close();
    }

    //一对多
    @Test
    public void testordersAndOrderDetailVoMap(){
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        OrdersVo ordersVo = new OrdersVo();
        ordersVo.setId(5);

        List<OrdersVo> ordersVos = ordersMapper.findordersAndOrderDetailVoMap(ordersVo);
        sqlSession.close();
    }

    @Test
    public void findOrderInfoByLazyLoad(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        List<OrdersVo> ordersVos = ordersMapper.findOrderInfoByLazyLoad(5);

        System.out.println(ordersVos.get(0).getUser());
        sqlSession.close();



    }



    @Test
    public void testMapper(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext");

        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");

        System.out.println(userMapper.findUserById("10"));
    }
}

