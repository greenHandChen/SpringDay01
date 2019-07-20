package com.tlq.enity;

import lombok.Data;

import java.util.List;

/**
 * @Description: 订单详情POJO
 * @Author: TanLinQuan
 * @Date: 2019/7/19 10:22
 * @Version: V1.0
 **/
@Data
public class OrderDetail {

//  订单详情ID
    private Integer id;

//  订单ID
    private Integer ordersId;

//   商品ID
    private Integer itemsId;

//    商品数量
    private Integer itemsNum;

//  商品List
    private List<Item> itemList;


    //  商品总价
    private Double total;
//
    private String number;


}
