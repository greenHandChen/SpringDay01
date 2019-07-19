import com.hand.lq.dao.Test1Mapper;
import com.hand.lq.pojo.OrderExt;
import com.hand.lq.pojo.OrderExt2;
import com.hand.lq.pojo.OrderExt3;
import com.hand.lq.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    private SqlSessionFactory sqlSessionFactory;

    /**
     * 基于resulttype
     * @throws IOException
     */
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    @org.junit.Test
    public void test1(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Test1Mapper test1Mapper=sqlSession.getMapper(Test1Mapper.class);
        OrderExt orderExt1=new OrderExt();
        orderExt1.setId(5);
        OrderExt orderExt=test1Mapper.findOrderExt(orderExt1);
        System.out.println(orderExt.toString());
        sqlSession.close();

    }

    /**
     * 基于resultmap
     */
    @org.junit.Test
    public void test2(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Test1Mapper test1Mapper=sqlSession.getMapper(Test1Mapper.class);
        OrderExt orderExt1=new OrderExt();
        orderExt1.setId(4);
        OrderExt2 orderExt=test1Mapper.findOrderExt2(orderExt1);
        System.out.println(orderExt.toString());

        sqlSession.close();
    }

    /**
     *一对多测试
     */
    @org.junit.Test
    public void test3(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Test1Mapper test1Mapper=sqlSession.getMapper(Test1Mapper.class);
        OrderExt orderExt1=new OrderExt();
        orderExt1.setId(4);
        OrderExt3 orderExt=test1Mapper.find3(orderExt1);
        System.out.println(orderExt.toString());
        System.out.println(orderExt.getOd().size());
        sqlSession.close();

    }

    /**
     *延迟加载
     */
    @org.junit.Test
    public void test4(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Test1Mapper test1Mapper=sqlSession.getMapper(Test1Mapper.class);
        List<OrderExt2> orderExt=test1Mapper.findOrderByLazyLoad(4);
        System.out.println(orderExt.get(0).getUser());
        sqlSession.close();

    }
    /**
     * 测试缓存
     */
    @org.junit.Test
    public void test5(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Test1Mapper test1Mapper=sqlSession.getMapper(Test1Mapper.class);
        OrderExt orderExt1=new OrderExt();
        orderExt1.setId(4);
        test1Mapper.find3(orderExt1);
        test1Mapper.find3(orderExt1);
        sqlSession.close();

    }

    /**
     * 测试二级缓存
     */
    @org.junit.Test
    public void test6(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        Test1Mapper test1Mapper=sqlSession.getMapper(Test1Mapper.class);
        Test1Mapper test1Mapper2=sqlSession2.getMapper(Test1Mapper.class);
        OrderExt orderExt1=new OrderExt();
        orderExt1.setId(4);
        test1Mapper.find3(orderExt1);
        sqlSession.close();
        test1Mapper2.find3(orderExt1);
        sqlSession2.close();

    }
}
