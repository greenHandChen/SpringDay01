package com.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/20.
 */
@Data
public class OrdersExt {
    // 订单编号
    private String number;
    // 商品名称
    private String name;
    // 订单创建时间起
    private Date createtimeStart;
    // 订单创建时间止
    private Date createtimeEnd;
    // 商品价格起
    private float priceStart;
    // 商品价格止
    private float priceEnd;
    // 用户名
//    private String username;
    // 用户地址
//    private String address;
    // 商品价格
    private float price;
    // 订单创建时间
    private Date createtime;
    // 订单总价
    private double total_amount;

    private User user;
}
