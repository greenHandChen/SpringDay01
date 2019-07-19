package com.jqh.pojo;

import lombok.Data;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 09:59
 * @Description: OrdersExt2
 */
@Data
public class OrdersExt2 extends Orders {
    private String username;
    private String address;
    private User user;
}
