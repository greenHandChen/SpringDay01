package com.hand.bean;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrdersExt extends Orders {

    private String username;
    private String address;

    private User user;

    private List<OrderDetail> detailList = new ArrayList<>();
    private List<Items> itemsList = new ArrayList<>();
    private Float totalAmount;

    private String name;
    private Date createtimeStart;
    private Date createtimeEnd;
    private Float priceStart;
    private Float priceEnd;

}
