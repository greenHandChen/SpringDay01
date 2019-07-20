package haunglehao.study.ms.mapper;

import haunglehao.study.ms.mapper.OrdersMapper;

import haunglehao.study.ms.po.OrdersExt;
import haunglehao.study.ms.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 17:09 2019/7/19
 */
public class OrdersMapperMapperTest {
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");

    }

    @Test
    public void findOrdersExts()throws Exception{
        OrdersMapper ordersMapper=(OrdersMapper)ctx.getBean("ordersMapper");
        OrdersExt ordersExt=new OrdersExt();
        List<OrdersExt> list=ordersMapper.findOrdersExts(ordersExt);
        System.out.println(list);
    }
}
