package com.hand.pojo;

import java.util.List;

/**
 * @author dingwensheng
 * @description: 创建order扩展类
 * @date 2019/7/199:13
 */
public class OrdersExt extends Orders{
    /**
     * @auther: dingwensheng
     * @description: 查询用户及订单信息，第一种方式直接和扩展类关联
     * @date: 2019/7/19
     */
//    private String username;
//    private  String  address;
//
//    @Override
//    public String toString() {
//        return "OrdersExt{" +
//                "username='" + username + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }

      /**
       * @auther: dingwensheng
       * @description:查询用户及订单信息，第二种方式间接和扩展类关联
       * @date: 2019/7/19
       */

//    private  User user;
//    @Override
//    public String toString() {
//        return "OrdersExt{" +
//                "User=" + user +
//                '}';
//    }

    /**
     * @auther: dingwensheng
     * @description:查询订单信息，关联查询订单明细信息，及用户信息
     * @date: 2019/7/19
     */

    private User user;
    private List<OrderDetail> orderDetails;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "user=" + user +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
