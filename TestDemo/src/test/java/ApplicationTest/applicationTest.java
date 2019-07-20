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
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class); //order

        System.out.println("---------- 查找订单信息，订单详情及其用户信息 ----------");
        System.out.println("---------- 一对多映射 ----------");
        List<OrderExt> orderExtList3 = orderMapper.findDrderAndOrderDetail();

        for(int i = 0; i < orderExtList3.size(); i++) {

            System.out.println(orderExtList3.get(i));

        }
    }
}
