import com.jqh.mapper.OrdersExt2Mapper;
import com.jqh.mapper.OrdersExtMapper;
import com.jqh.pojo.OrdersExt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 09:35
 * @Description: Test121
 */
public class Test121 {
    static private SqlSessionFactory sqlSessionFactory;

    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSelect(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersExtMapper mapper = sqlSession.getMapper(OrdersExtMapper.class);
        OrdersExt ext = new OrdersExt();
        ext.setId(3);
        System.out.println(mapper.findOrdersExt(ext));
    }
    @Test
    public void testSelect2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersExt2Mapper mapper = sqlSession.getMapper(OrdersExt2Mapper.class);
        System.out.println(mapper.findByUserId(1));
    }
    @Test
    public void testSelect3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersExt2Mapper mapper = sqlSession.getMapper(OrdersExt2Mapper.class);
        System.out.println(mapper.findByUserIdLoad(1));
    }
}
