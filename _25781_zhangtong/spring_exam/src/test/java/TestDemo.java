import com.zt.exam.domain.OrdersExt;
import com.zt.exam.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-20 15:30
 */
public class TestDemo {

    private OrderMapper orderMapper;

    @Before
    public void init() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\_25781_zhangtong\\spring_exam\\src\\main\\resources\\config\\applicationContext.xml");
        orderMapper = applicationContext.getBean("orderMapper", OrderMapper.class);
    }

    @Test
    public void test_01() {
        /**
         * @description: 测试根据查询条件查询订单明细数据
         * @author: invokerZt
         * @date: 2019-07-20 15:30
         * @param :
         * @return: void
         */
        OrdersExt ordersExt = new OrdersExt();
        //ordersExt.setNumber("1000011");
        ordersExt.setPriceStart(5000f);
        ordersExt.setPriceEnd(7000f);
        List<OrdersExt> orders = orderMapper.findOrdersExts(ordersExt);
        for(OrdersExt oe : orders) {
            System.out.println(oe);
        }
    }
}
