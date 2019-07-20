package com.test.dotest;

import com.test.mapper.OrderMapper;
import com.test.pojo.Order;
import com.test.pojo.Orderdetail;
import com.test.pojo.OrdersExt;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description: 测试查询用户信息
 * @author: xueWu.Chen
 * @create: 2019-07-20
 **/

public class OrderExtTest {
    @Test
    public void userOrderDetailRstTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderMapper orderMapper = applicationContext.getBean(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setOrd_id(1000011);   //当查询条件为 number1000011时
        List<OrdersExt> ordersExt1 =  orderMapper.finOrdersExts(ordersExt);
        for (OrdersExt o:ordersExt1
             ) {
            System.out.println(o.getOrd_id()+" "+o.getUsername());
            if(!o.getOrders().isEmpty()) {
                for (Order or : o.getOrders()
                ) {
                    System.out.println(or.getCreatetime()+" "+or.getNumber()+" ");
                }
            }else if(!o.getOrderdetails().isEmpty()){
                for (Orderdetail od:o.getOrderdetails()
                     ) {
                    System.out.println(od.getItems_num()+" "+od.getItems());
                }

            }
        }
    }
}
