package com.jqh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 09:19
 * @Description: OrdersExt
 */
@Data
public class OrdersExt extends Orders {
    private User user;
    private OrderDetail orderDetail;
    private Items items;
    private float totalPrice;
    private String name;
    private Date createtimeStart;
    private Date createtimeEnd;
    private float priceStart;
    private float priceEnd;

    @Override
    public String toString() {
        return "OrdersExt{" +
                "user=" + user +
                ", number=" + super.getNumber() +
                "createtime"+super.getCreatetime();
    }
}
