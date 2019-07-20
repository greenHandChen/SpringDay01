import com.mybatis.dao.OrdersExtDao;
import com.mybatis.pojo.OrdersExt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testOrdersExt {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void findOrdersExt(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersExtDao mapper = sqlSession.getMapper(OrdersExtDao.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExt1 = mapper.findOrdersExts(ordersExt);
        System.out.println(ordersExt1);
        sqlSession.close();
    }
}
