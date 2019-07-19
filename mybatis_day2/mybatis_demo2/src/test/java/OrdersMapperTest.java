import com.domain.OrdersExt;
import com.mapper.OrdersMapper;
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
 * @Date:Create in 16:32 2019/7/19
 * @Modified By:
 */
public class OrdersMapperTest {
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

    @Test   //测试延迟加载--SqlMapConfig.xml中未开启延迟加载--执行n+1条sql
    public void testFindOrdersAndUserLazyLoading(){
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> ordersExtList=ordersMapper.findOrdersAndUserLazyLoading();
        //下面调用了OrderExt的toString方法,会输出user,则会对user进行查询ss
        ordersExtList.forEach(ordersExt -> System.out.println(ordersExt));
    }

}