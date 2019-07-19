import damain.OrdersExt;
import damain.User;
import mapper.OrdersMapper;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDay2 {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        this.sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void findOrdersExt(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExts1=ordersMapper.findOrdersExt(ordersExt);
        for(OrdersExt o:ordersExts1)
            System.out.println(o.toString());
        sqlSession.close();
    }
    @Test
    public  void findOrdersExtByRsmap()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExts1=ordersMapper.findOrdersByResultMap(ordersExt);
        for(OrdersExt o:ordersExts1)
            System.out.println(o.toString());
        sqlSession.close();
    }
    @Test
    public void OneToMore()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExts1=ordersMapper.findOrdersAndOrderDetail(ordersExt);
        System.out.println(ordersExts1.isEmpty());

    }
    @Test
    public void findOrderInfoByLazyLoad(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> ordersExts=ordersMapper.findOrderInfoByLazyLoad(4);
        System.out.println(ordersExts.get(0).getUser());
        sqlSession.close();


    }
    @Test
    public void testFirstCacheDemo01(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.findUserById(1);
        userMapper.findUserById(1);
        sqlSession.close();

    }
    @Test
    public void testFirstCacheDemo02(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.findUserById(1);
        User user=new User();
        user.setUsername("缓存测试");
        userMapper.addUser(user);
        userMapper.findUserById(1);
        sqlSession.close();

    }
    @Test
    public void testSecondCacheDemo01(){
        SqlSession sqlSession1=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        SqlSession sqlSession3=sqlSessionFactory.openSession();
        UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2=sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3=sqlSession3.getMapper(UserMapper.class);
        userMapper1.findUserById(1);
        sqlSession1.close();
        userMapper2.findUserById(1);
        sqlSession2.close();
    }
    @Test
    public void testSecondCacheDemo02(){
        SqlSession sqlSession1=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        SqlSession sqlSession3=sqlSessionFactory.openSession();
        UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2=sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3=sqlSession3.getMapper(UserMapper.class);
        userMapper1.findUserById(1);
        sqlSession1.close();
        User user=new User();
        user.setUsername("缓存测试");
        userMapper3.addUser(user);
        //清空二级缓存
        sqlSession3.commit();
        sqlSession3.close();
        userMapper2.findUserById(1);
        sqlSession2.close();
    }

}
