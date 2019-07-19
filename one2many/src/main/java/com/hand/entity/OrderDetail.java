package com.hand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by HuangHeng on 2019/7/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    private Integer id;

    private Integer ordersId;

    private Integer itemsId;

    private Integer itemsNum;

}
