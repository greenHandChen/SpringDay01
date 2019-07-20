package com.hand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Created by HuangHeng on 2019/7/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    private Integer id;

    private Integer userId;

    private String number;

    private Date createtime;

    private String note;

    //订单明细信息
    private List<OrderDetail> detailList;

}
