package com.hand.bean;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrdersInfo extends Orders {

    private User user;

}
