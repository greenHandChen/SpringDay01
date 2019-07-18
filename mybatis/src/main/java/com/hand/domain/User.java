package com.hand.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;

}
