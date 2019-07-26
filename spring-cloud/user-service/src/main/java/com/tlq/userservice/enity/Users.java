package com.tlq.userservice.enity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 用户POJO模型
 * @Author: TanLinQuan
 * @Date: 2019/7/26 14:20
 * @Version: V1.0
 **/
@Data
public class Users {

    private Long id;
    private String userName;
    private String email;
    private String sex;
    private Long countryId;
    private String countryName;

    public Users() {}

    public Users(Long id, String userName, String email, String sex, Long countryId) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.sex = sex;
        this.countryId = countryId;
    }
}
