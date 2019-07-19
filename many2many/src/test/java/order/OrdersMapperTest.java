package order;

import com.hand.entity.OrdersExt;
import com.hand.entity.User;
import com.hand.mapper.OrdersMapper;
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

/**
 * Created by HuangHeng on 2019/7/19
 */
public class OrdersMapperTest {

    private SqlSession sqlSession =null;

    @Before
    public void before() throws IOException {
        String resource = "mybatisConfig.xml";
        InputStream inputStream
                = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession= sqlSessionFactory.openSession();
    }

    /**
     * @Author:  HuangHeng
     * @Description 一对多关系映射之 resultType
     *                适用于查找订单明细
     * @CreateDate:  2019/7/19
     */
    @Test
    public void findOrdersAndUser(){
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<User> list = mapper.findOrderAndItemslResultMap();
        sqlSession.close();
        System.out.println("findOrdersAndUser-------->"+list);
    }

    
}
