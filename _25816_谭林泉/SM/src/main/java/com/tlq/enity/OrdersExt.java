package com.tlq.enity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/19 9:19
 * @Version: V1.0
 **/
@Data
public class OrdersExt extends Order {

//    用户
    private User user;
//    订单
    private List<OrderDetail> orderDetailList;

//    商品总价
    private Float total;

//    起止时间
    private Date createtimeStart;

    private Date createtimeEnd;

//    价格起止
    private Float priceStart;

    private Float priceEnd;

//   名称
    private String name;

}
