package ApplicationTest;

import Entity.OrderExt;
import Mapper.OrderMapper;
import Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class applicationTest {

    @Test
    public void test() throws IOException {

        // 1. 读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2. 创建AqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3. 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取mapper代理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class); // user

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class); //order

        // user
        System.out.println("----------查找单条用户信息 ----------");

        userMapper.findUserById(10).getAllInfo();

        // order
        System.out.println("---------- 查找单条订单信息 ----------");

       orderMapper.findOrderById(3).getAllInfo();

        System.out.println("---------- 查找订单信息及其用户信息 ----------");

        OrderExt orderExt =  new OrderExt();

        System.out.println("一对一映射：使用resultType方法");
        List<OrderExt> orderExtList1 = orderMapper.findOrderExt1(orderExt);

        for(int i = 0; i < orderExtList1.size(); i++) {

            orderExtList1.get(i).getAllInfo();
            System.out.println(orderExtList1.get(i).getUsername());

        }

        System.out.println("一对一映射：使用resultMap方法");
        List<OrderExt> orderExtList2 = orderMapper.findOrderExt2(orderExt);

        for(int i = 0; i < orderExtList2.size(); i++) {

            orderExtList2.get(i).getAllInfo();
            System.out.println(orderExtList2.get(i).getUser().getUsername());

        }

        System.out.println("---------- 查找订单信息，订单详情及其用户信息 ----------");
        System.out.println("---------- 一对多映射 ----------");
        List<OrderExt> orderExtList3 = orderMapper.findDrderAndOrderDetail();

        for(int i = 0; i < orderExtList3.size(); i++) {

            System.out.println(orderExtList3.get(i));

        }
    }
}
