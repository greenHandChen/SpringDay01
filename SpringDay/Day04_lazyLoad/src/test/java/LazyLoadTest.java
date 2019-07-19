import day04_lazyload.domain.ext.OrdersExt3;
import day04_lazyload.mapper.OrdersExt3Mapper;
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
 * Created by wangjie_fourth on 2019/7/19.
 */
public class LazyLoadTest {


    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void test01(){
        OrdersExt3 ordersExt3 = new OrdersExt3();
        ordersExt3.setId(3);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersExt3Mapper mapper = sqlSession.getMapper(OrdersExt3Mapper.class);

        List<OrdersExt3> list = mapper.findOrdersExt(ordersExt3);
        System.out.println(list.size());
        System.out.println(list.get(0).getOrderdetails().size());
        sqlSession.close();
    }

    @Test
    // 测试积极懒加载
    public void test02(){
        OrdersExt3 ordersExt3 = new OrdersExt3();
        ordersExt3.setId(3);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersExt3Mapper mapper = sqlSession.getMapper(OrdersExt3Mapper.class);

        List<OrdersExt3> list = mapper.findOrdersExt(ordersExt3);

        System.out.println(list.get(0).getId());

        System.out.println(list.get(0).getOrderdetails());
    }
}
