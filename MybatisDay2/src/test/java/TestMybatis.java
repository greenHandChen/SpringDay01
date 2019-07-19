import com.hand.entity.OrderDetail;
import com.hand.entity.Orders;
import com.hand.entity.OrdersExt;
import com.hand.mapper.OrderMapper;
import com.hand.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init()throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void demo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper  = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        OrdersExt ordersExt1 = mapper.findOrderExt(ordersExt);
        System.out.println(ordersExt1);
        sqlSession.close();
    }

    @Test
    public void demo2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper  = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = mapper.findOrderExtByRstMap(5);
        System.out.println(ordersExt);
        sqlSession.close();
    }

    @Test
    public void demo3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = mapper.findOrdersAndOrderDetail(3);
        System.out.println(ordersExt);

        sqlSession.close();
    }

    @Test
    public void demo4(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.findUserById(1);
        userMapper.findUserById(1);
        sqlSession.close();
    }


}
