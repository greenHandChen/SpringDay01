package com.hand.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors
public class OrderDetail {

    private Integer id;
    private Integer ordersId;
    private Integer itemsId;
    private Integer itemsNum;

}
