import common.OrdersExt;
import domain.User;
import mapper.OrderMapper;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BatisTest {
    private SqlSessionFactory sqlSessionFactory;


    @Test
    public void testDemoA() throws IOException {
        //
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderMapper orderMapper = applicationContext.getBean(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(6);
        List<OrdersExt> ordersExtList = orderMapper.findOrdersExts(ordersExt);
        System.out.println(ordersExtList.get(0));

    }


}
