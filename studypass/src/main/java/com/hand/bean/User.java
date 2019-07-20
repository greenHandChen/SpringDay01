package com.hand.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors
public class User implements Serializable {

    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;

}
