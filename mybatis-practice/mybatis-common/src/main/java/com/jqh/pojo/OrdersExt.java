package com.jqh.pojo;

import lombok.Data;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 09:19
 * @Description: OrdersExt
 */
@Data
public class OrdersExt extends Orders {
    private String username;
    private String address;

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}'+super.toString();
    }
}
