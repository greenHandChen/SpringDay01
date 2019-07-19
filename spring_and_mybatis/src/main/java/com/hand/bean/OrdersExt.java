package com.hand.bean;

import lombok.*;

import java.util.ArrayList;
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

    private List<OrderDetail> DetailList = new ArrayList<>();

}
