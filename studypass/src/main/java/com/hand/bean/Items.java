package com.hand.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors
public class Items {

    private Integer id;
    private String name;
    private Float price;
    private String detail;
    private String pic;
    private Date createTime;

}
