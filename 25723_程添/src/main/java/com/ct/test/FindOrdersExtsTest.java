package com.ct.test;


import com.ct.domain.OrdersExt;
import com.ct.mapper.OrdersExtMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class FindOrdersExtsTest {
    @Test
    public void testFindOrdersExts() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        OrdersExtMapper ordersExtMapper = applicationContext.getBean(OrdersExtMapper.class);
        //查询条件封装，查询条件可任意组装，可设置为空
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setNumber("1000010");
        try {
            ordersExt.setCreatetime(new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-04"));
            ordersExt.setCreatetimeStart(new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-03"));
            ordersExt.setCreatetimeEnd(new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-05"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ordersExt.setName("台式机");
        ordersExt.setPrice(3000.10F);
        ordersExt.setPriceStart(3000F);
        ordersExt.setPriceEnd(3100F);
        //执行查询得到查询结果
        List<OrdersExt> ordersExts = ordersExtMapper.findOrdersExts(ordersExt);
        for(OrdersExt ordersExt1 : ordersExts) {
            System.out.println(ordersExt1);
        }
    }
}
