import com.domain.OrdersExt;
import com.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 9:47 2019/7/19
 * @Modified By:
 */
public class OrderMapperTest {

    private SqlSession sqlSession;

    @Before
    public void testBefore() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("Mybatis/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
    }

    @After
    public void testAfter(){
        sqlSession.close();
    }

    @Test
    public void findOrdersAndUser() throws IOException {
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> ordersExtList=orderMapper.findOrdersAndUser();
        System.out.println(ordersExtList);
    }

    @Test
    public void findOrderAndUserResultMap() throws IOException {
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> ordersExtList=orderMapper.findOrderAndUserResultMap();
        System.out.println(ordersExtList);
    }

    @Test
    public void findOrdersDatilsAndOrdersAndUserResultMap() throws IOException {
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> ordersExtList=orderMapper.findOrdersAndOrdersDatilsAndUserResultMap();
        //lambda表达式,遍历list
        ordersExtList.forEach(ordersExt -> System.out.println(ordersExt));
    }

    @Test
    public void findOrdersAndOrdersDatilsAndUserAndItemsResultMap() throws IOException {
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> ordersExtList=orderMapper.findOrdersAndOrdersDatilsAndUserAndItemsResultMap();
        //lambda表达式,遍历list
        ordersExtList.forEach(ordersExt -> System.out.println(ordersExt));
    }
}
