package com.tlq.enity;

import lombok.Data;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/19 9:19
 * @Version: V1.0
 **/
@Data
public class OrdersExt extends Order {

    private String username;

    private String address;

}
