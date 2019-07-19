package com.jqh.pojo;

import lombok.Data;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 09:10
 * @Description: OrderDetail
 */
@Data
public class OrderDetail {
    private Integer id;
    private Integer ordersId;
    private Integer itemsId;
    private Integer itemsNum;

}
