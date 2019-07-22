package com.ceh.java.examine;

import com.ceh.java.examine.domain.OrdersExt;
import com.ceh.java.examine.mapper.OrderMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by enHui.Chen on 2019/7/11.
 */
public class Examine {

    @Test
    public void testFindOrdersExts() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
        OrderMapper orderMapper = applicationContext.getBean("orderMapper", OrderMapper.class);

        List<OrdersExt> ordersExts = orderMapper.findOrdersExts(testPrice());
        System.out.println(ordersExts);
    }

    private OrdersExt testDate() {
        OrdersExt ordersExt = new OrdersExt();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ordersExt.setCreatetimeStart(sdf.parse("2015-02-03"));
            ordersExt.setCreatetimeEnd(sdf.parse("2015-02-04"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ordersExt;
    }

    private OrdersExt testPrice() {
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setPriceStart(3000.0D);
        ordersExt.setPriceEnd(3000.2D);
        return ordersExt;
    }

    private OrdersExt testNumber() {
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setNumber("1000014");
        return ordersExt;
    }

    private OrdersExt testName() {
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setName("笔");
        return ordersExt;
    }
}
