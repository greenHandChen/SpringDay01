package com.hand.test;

import com.hand.entity.Orders;
import com.hand.entity.User;
import com.hand.entity.UserExit;
import com.hand.entity.UserOrders;
import com.hand.service.IItemsService;
import com.hand.service.IOrderService;
import com.hand.service.IUserService;
import com.hand.service.impl.ItemsServiceImpl;
import com.hand.service.impl.OrderServiceImpl;
import com.hand.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MyTest {

    private IUserService userService;
    private IOrderService orderService;
    private IItemsService iItemsService;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        userService = applicationContext.getBean(UserServiceImpl.class);
        orderService = applicationContext.getBean(OrderServiceImpl.class);
        iItemsService=applicationContext.getBean(ItemsServiceImpl.class);
    }

    @Test
    public void testGetAll() {
        System.out.println(userService.getAllUser());
    }

    @Test
    public void testGetById() {
        System.out.println(userService.getUserById(1));
    }

    @Test
    public void testGetMap() {
        List<Map<Integer, User>> allUserMap = userService.getAllUserMap();
        Map<Integer, User> integerUserMap = allUserMap.get(0);
        System.out.println(integerUserMap.get(1));
    }

    @Test
    public void testChangeName() {
        userService.changeName(1,38);
    }

    /**
     * 一对多查询
     */
    @Test
    public void selectUserAndOrders(){
        printColl(userService.getUser_OrdersByUserId(1));
    }

    @Test
    public void testGetAllMessage(){
        printList(iItemsService.getAllMessage());
    }

    /**
     * 多对一查询
     */
    @Test
    public void selectOrdersUser(){
        printList(orderService.getOrderAndUser(1));
    }


    private void printList(List<?> objList){
        for(Object obj:objList){
            System.out.println(obj);
        }
    }

    private void printColl(Collection<?> objColl) {
        for (Object obj : objColl) {
            if (obj instanceof UserOrders) {
                UserOrders userOrders = (UserOrders) obj;
                for (Orders orders : userOrders.getOrdersset()) {
                    System.out.println(userOrders.getUser_id() + "\t" +
                            userOrders.getUsername() + "\t" +
                            userOrders.getSex() + "\t" +
                            userOrders.getBirthday() + "\t" +
                            userOrders.getAddress() + "\t" +
                            orders.getId() + "\t" +
                            orders.getNumber() + "\t" +
                            orders.getCreatetime() + "\t" +
                            orders.getNote() + "\t"

                    );
                }
            }
        }
    }

    @Test
    public void test001(){
        printList(userService.getUser_OrdersByUserIduseExit(1));
    }


}
