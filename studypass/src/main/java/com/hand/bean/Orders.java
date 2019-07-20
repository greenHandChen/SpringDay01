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
public class Orders {

    private Integer id;
    private Integer userId;
    private String number;
    private Data dateTime;
    private String note;

}
