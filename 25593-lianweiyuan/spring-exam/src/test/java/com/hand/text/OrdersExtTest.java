package com.hand.text;

import com.hand.entity.OrderExt;
import com.hand.entity.User;
import com.hand.mapper.OrdersMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/20 16:01
 */
public class OrdersExtTest {

    @Autowired
    private OrdersMapper ordersMapper;

    @Test
    public void test() {

        OrderExt orderExt = new OrderExt();
        orderExt.setId(3);
        User user = new User();
        user.setId(1);
        orderExt.setUser(user);


        List<OrderExt> orderExtList =  ordersMapper.findOrdersExts(orderExt);

    }
}
