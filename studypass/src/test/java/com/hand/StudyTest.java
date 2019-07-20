package com.hand;

import com.hand.bean.OrdersExt;
import com.hand.dao.impl.OrdersExtDaoImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class StudyTest {

    ApplicationContext ctx;
    String ctxName = "applicationContext.xml";

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext(ctxName);
    }

    @Test
    public void testFindOrdersExts() throws ParseException {
        OrdersExtDaoImpl bean = ctx.getBean(OrdersExtDaoImpl.class);

        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date startTime = dateFormat1.parse("2015-02-01");
        Date endTime = dateFormat1.parse("2015-02-05");

        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(null);
        ordersExt.setName(null);
        ordersExt.setCreatetimeStart(null);
        ordersExt.setCreatetimeEnd(null);
        ordersExt.setPriceStart(null);
        ordersExt.setPriceEnd(null);

        List<OrdersExt> ordersExts = bean.findOrdersExts(ordersExt);
        for(OrdersExt o : ordersExts)
            System.out.println(o);
    }

}
