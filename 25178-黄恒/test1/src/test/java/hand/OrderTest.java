package hand;

import com.hand.dao.OrdersMapper;
import com.hand.entity.Items;
import com.hand.entity.OrdersExt;
import com.hand.entity.User;
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
 * Created by HuangHeng on 2019/7/20
 */
public class OrderTest {

    private SqlSession sqlSession =null;

    @Before
    public void before() throws IOException {
        String resource = "mybatisConfig.xml";
        InputStream inputStream
                = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession= sqlSessionFactory.openSession();
    }

    @Test
    public void findOrdersExts(){
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setUsername("tt");
        Items items=new Items();
        items.setName("");
        List<OrdersExt> ordersExts = mapper.findOrdersExts(ordersExt);
        sqlSession.close();
        System.out.println("findOrdersExts-------->"+ordersExts);
    }
}
