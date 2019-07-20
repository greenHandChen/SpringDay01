import com.wzh.domain.Items;
import com.wzh.domain.Orders;
import com.wzh.domain.User;
import com.wzh.mapper.ItemsMapper;
import com.wzh.mapper.OrdersMapper;
import com.wzh.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.java2d.pipe.LCDTextRenderer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testDemo {
    @Test
    public void demo1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
//        User user = new User(2, "无双", '男', new Date(), "广州");
//        int i = userMapper.updateUser(user);
        int t = userMapper.deleteUser(2);
        System.out.println(t);
    }

    @Test
    public void demo2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrdersMapper ordersMapper = applicationContext.getBean(OrdersMapper.class);
        ordersMapper.findOrdersById(3);
        List<Integer> list = ordersMapper.queryOrdersByUserId(1);
        List<Orders> ordersList = new ArrayList<Orders>();
        for (Integer integer : list) {
            Orders orders = ordersMapper.findOrdersById(integer);
            ordersList.add(orders);
        }
        for (Orders orders : ordersList) {
            System.out.println(orders);
        }
    }

    @Test
    public void demo3() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsMapper itemsMapper = applicationContext.getBean(ItemsMapper.class);
        Items items = itemsMapper.findItemsById(1);
        System.out.println(items);
    }


}
