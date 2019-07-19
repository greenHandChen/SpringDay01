import com.hand.mapper.UserMapper;
import com.hand.pojo.OrdersExt;
import com.hand.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author dingwensheng
 * @description: TODO
 * @date 2019/7/199:32
 */

public  class  mybitis02_test  {
    @Test
    public void demo01() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> orderExt = userMapper.findOrderExt(ordersExt);
        System.out.println(orderExt);
        session.close();
    }

    @Test
    public void demo02() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> orderExt = userMapper.findOrderByResultMap(ordersExt);

        System.out.println(orderExt);
        session.close();
    }

    @Test
    public void demo03() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(4);
        List<OrdersExt> orderExt = userMapper.findOrderByResultMap(ordersExt);

        System.out.println(orderExt);
        session.close();
    }

    /**
     * @auther: dingwensheng
     * @description:懒加载
     * @date: 2019/7/19
     */
    @Test
    public void demo04() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<OrdersExt> orderExt = userMapper.findOrderInfoBylazyLoad(4);

        orderExt.get(0).getUser();
        System.out.println(orderExt.get(0).getUser());
        session.close();
    }

    @Test
    public void demoCache01() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        userMapper.findUserById(4);
        userMapper.findUserById(4);
        session.close();
    }

    @Test
    public void demoCache02() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        User user = new User();
        user.setUsername("缓存测试");
        UserMapper userMapper = session.getMapper(UserMapper.class);
        userMapper.findUserById(4);
        userMapper.addUser(user);
        userMapper.findUserById(4);
        session.close();
    }

    @Test
    public void demoCache03() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session1 = sessionFactory.openSession();
        SqlSession session2 = sessionFactory.openSession();

        UserMapper userMapper1 = session1.getMapper(UserMapper.class);
        UserMapper userMapper2 = session2.getMapper(UserMapper.class);

        userMapper1.findUserById(4);
        session1.close();
        userMapper2.findUserById(4);
        session2.close();
    }
}
