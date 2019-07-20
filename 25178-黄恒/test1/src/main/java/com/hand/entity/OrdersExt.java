package com.hand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersExt extends Orders {

    private String username;

    private String sex;

    private User user;

    private List<OrderDetail> detailList;

    private Items items;

}
