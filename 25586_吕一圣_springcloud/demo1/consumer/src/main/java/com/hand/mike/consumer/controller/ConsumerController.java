package com.hand.mike.consumer.controller;

import com.hand.mike.consumer.service.ConsumerService;
import com.hand.mike.consumer.service.ConsumerServiceExt;
import com.hand.mike.provider.domain.Orders;
import com.hand.mike.provider.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ConsumerController {

    private Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private ConsumerServiceExt consumerServiceExt;

    /**
      * @Desc: 获取用户
      */
    @RequestMapping(value = "/consumer/get/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return consumerService.getUser(id);
    }

    /**
      * @Desc: 添加用户
      */
    @RequestMapping(value = "/consumer/add",method = RequestMethod.POST)
    public Integer addUser(@PathParam("user") User user){
        Integer reuslt = consumerService.addUser(user);
        return reuslt;
    }

    /**
      * @Desc: 删除用户
      */
    @RequestMapping(value = "/consumer/delete/{id}")
    public Integer deleteUser(@PathVariable("id") Integer id){
        return consumerService.deleteUser(id);
    }

    /**
      * @Desc: 更新用户
      */
    @RequestMapping(value = "/consumer/update")
    public Integer updateUser(@PathParam("user") User user){
        return consumerService.updateUser(user);
    }

    /**
      * @Desc: 获取订单
      */
    @RequestMapping(value = "/consumer/getOrder/{id}",method = RequestMethod.GET)
    public Orders getOrder(@PathVariable("id")Integer id){
        return consumerServiceExt.getOrder(id);
    }

    /**
      * @Desc: 添加订单
      */
    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
    public Integer addOrder(@PathParam("order") Orders order){
        logger.info(order.toString());
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        try {
            order.setCreatetime(sdf.parse(order.getCreatetime().toString()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        logger.info(order.toString());
        return consumerServiceExt.addOrder(order);
    }

    /**
      * @Desc: 删除订单
      */
    @RequestMapping(value = "/deleteOrder/{id}",method = RequestMethod.GET)
    public Integer deleteOrder(@PathVariable("id") Integer id){
        return consumerServiceExt.deleteOrder(id);
    }

    /**
      * @Desc: 更新订单
      */
    @RequestMapping(value = "/updateOrder",method = RequestMethod.POST)
    public Integer updateOrder(@PathParam("order") Orders order){
        return consumerServiceExt.updateOrder(order);
    }


}
