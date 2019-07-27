/**
 * Created by Hsl
 * 2019/7/26 18:54
 */
package com.hand.consumer.Controller;

import com.hand.consumer.ClientService.OrderClientService;
import com.hand.consumer.ClientService.UserClientService;
import com.hand.consumer.pojo.Order;
import com.hand.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * @id  用户Id
     *      查找用户
     */
//    @Qualifier("PROVIDER-MYBATIS")
    @Autowired
    private UserClientService userClientService;
    @Autowired
    private OrderClientService orderClientService;

    @GetMapping("/getUser/{id}")
    public String findUserById(@PathVariable("id") Integer id){
//        System.out.println("你好");
//        System.out.println(id);
      String user =  userClientService.findUserById(id);
        System.out.println(user);
        return user;
    }

    /**
     * 添加用户
     */

    @PostMapping("/addUser")
    public String addUser(User user){
        System.out.println(user.getAddress());
      String result  =userClientService.addUser(user);
        return result;
    }

    /**
     * 查找订单
     *
     */
    @GetMapping("/getOrder/{userId}")
    public String findOrderByUserId(@PathVariable("id") Integer id){
//        System.out.println("你好");
//        System.out.println(id);
        String  order =  orderClientService.findOrderByUserId(id);
        System.out.println(order);
        return order;
    }




}
